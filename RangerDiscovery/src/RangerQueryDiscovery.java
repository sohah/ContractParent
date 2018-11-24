import com.microsoft.z3.*;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class RangerQueryDiscovery {
    public HashMap<String, String> cfg = new HashMap<String, String>();
    public Context ctx;
    public Solver disSolver, expSolver;

    public RangerQueryDiscovery() {
        ctx = new Context(cfg);
        cfg.put("proof", "true");
        disSolver = ctx.mkSolver();
        expSolver = ctx.mkSolver();
    }

    /**
     * @param disFileName discovered contract file name
     * @param expFileName the file name of the expected contract
     */
    public void discoverContract(String disFileName, String expFileName) {

        /*get solvers for each query*/
        disSolver = getSolverFromFile(disFileName);
        expSolver = getSolverFromFile(expFileName);


        BoolExpr[] unsatCore = checkDisAndNotExpProve(disSolver.getAssertions(), expSolver.getAssertions());


        if (unsatCore != null) {//A.1
            /*create assumptions out of the expected solver*/
            BoolExpr[] expAssertions = expSolver.getAssertions();
            BoolExpr[] partialAssertions = new BoolExpr[expAssertions.length];
            BoolExpr[][] satContracts = new BoolExpr[2 ^ expAssertions.length][expAssertions.length];

            //get powerset of cores
            for (int i = 0; i < (1 << expAssertions.length); i++) { //1<<len is 2 power n
                int selectedset = i; //for i = 10 it'd be 1010 it means chose 2nd and 4th item
                int ind = 0;
                int partialAssInd = 0;
                int k = 0;
                while (selectedset != 0) {
                    if ((selectedset & 1) == 1) {
                        partialAssertions[partialAssInd] = expAssertions[i];
                    }
                    ++partialAssInd;
                    selectedset = selectedset >> 1; //1010 101 10 1 0
                    ind++;
                }
                BoolExpr[] result = checkDisAndNotExpProve(disSolver.getAssertions(), partialAssertions);
                if (result == null) {
                    satContracts[k] = partialAssertions;
                    ++k;
                }
            }

            //printing partial assertions of the expected contracts that satisfy the implementation.
            for (int i = 0; i < satContracts.length; i++) {
                System.out.println(satContracts[i]);
            }
        }

    }

    private BoolExpr[] checkDisAndNotExpProve(BoolExpr[] disAssertions, BoolExpr[] expAssertions) {

        BoolExpr[] notExpAssertions = new BoolExpr[expAssertions.length];
        BoolExpr[] namedAssertions = new BoolExpr[expAssertions.length];
        String namedName = "Ranger_";

        for (int i = 0; i < expAssertions.length; i++) {
            notExpAssertions[i] = ctx.mkNot(expAssertions[i]);
            namedAssertions[i] = ctx.mkBoolConst(namedName + i);
        }

        Solver proveSolver = ctx.mkSolver();
        proveSolver.push();

        proveSolver.add(disAssertions);

        //for(int i=0; i<expAssertions.length; i++) {
        proveSolver.assertAndTrack(notExpAssertions, namedAssertions);
        //}
        //Status result = proveSolver.check(negExpAssertions);
        Status result = proveSolver.check();

        BoolExpr[] unsatCore;

        if (result == Status.SATISFIABLE)
            unsatCore = null;
        else {
            unsatCore = proveSolver.getUnsatCore();
            for (Expr c : proveSolver.getUnsatCore()) {
                System.out.println(c);
            }
        }
        proveSolver.pop();
        return unsatCore;
    }

    /**
     * Returns a solver that are built of the same assertions as the input file.
     *
     * @param fileName
     * @return
     */
    public Solver getSolverFromFile(String fileName) {

        try {
            Solver solver = ctx.mkSolver();
            solver.fromString(readFileToString(fileName));
            return solver;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Returns a string for the read file.
     *
     * @param fileName
     * @return
     * @throws IOException
     */
    public String readFileToString(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }

}
