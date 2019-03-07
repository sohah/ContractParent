import com.microsoft.z3.BoolExpr;
import com.microsoft.z3.Context;
import com.microsoft.z3.Solver;
import com.microsoft.z3.Status;
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


        /*A) check if d -> e, sat, can we find satisfying assignment for d -> e*/
            /*A.1) if sat, then potientially we want to check if we can prove it by checking the following*/
                /*check if !(d -> e) sat, */
            /*A.2) if it is unsat then we have an interesting behaviour that we need to explore by tunning
            * e and rechcking*/


        //A
        boolean implySat = checkDisAssertExpSat(disSolver, expSolver);
        BoolExpr[] unsatCore = checkDisAssertExpProve(disSolver, expSolver);
        if (unsatCore != null) {//A.1
            //A.2, we have an interesting behaviour that we can invistegate via unsat core

            /*create assumptions out of the expected solver*/


            //get powerset of cores


            //try running checkDisImplyExpProve over a subset in the power set.

        }

    }

    private BoolExpr[] checkDisAssertExpProve(Solver disSolver, Solver expSolver) {
//extract all assertions from the expected contract to start manipulating it.
        BoolExpr[] expAssertions = expSolver.getAssertions();
        BoolExpr[] disAssertions = disSolver.getAssertions();
        Solver proveSolver = ctx.mkSolver();
        proveSolver.push();

        BoolExpr[] negDisAssertions = new BoolExpr[disAssertions.length];
        BoolExpr[] negExpAssertions = new BoolExpr[expAssertions.length];

        for(int i=0; i<disAssertions.length; i++){
            negDisAssertions[i] = ctx.mkNot(disAssertions[i]);
        }
        proveSolver.add(negDisAssertions);

        for(int i=0; i<expAssertions.length; i++){
            negExpAssertions[i] = ctx.mkNot(expAssertions[i]);
        }
        proveSolver.add(negDisAssertions);
        //Status result = proveSolver.check(negExpAssertions);
        Status result = proveSolver.check();
        BoolExpr[] unsatCore;
        if(result == Status.SATISFIABLE)
            unsatCore =  null;
        else
            unsatCore = proveSolver.getUnsatCore();
        proveSolver.pop();
        return unsatCore;
    }

    private boolean checkDisAssertExpSat(Solver disSolver, Solver expSolver) {
        //extract all assertions from the expected contract to start mainpulating it.
        Pair<Integer, BoolExpr[]> expAssertions = new Pair(expSolver.getNumAssertions(), expSolver.getAssertions());

        //disSolver.push();
        //disSolver.add(expAssertions.getValue());
        Status result = disSolver.check(expAssertions.getValue()); //this should check with assumptions
        //disSolver.pop();
        return result == Status.SATISFIABLE;
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

    public void findOrderedPowerSet(){
        int[] a = {1, 2};
        int max = 1 << a.length;
        int[][] result = new int[max][];
        for (int i = 0; i < max; ++i) {
            result[i] = new int[Integer.bitCount(i)];
            for (int j = 0, b = i, k = 0; j < a.length; ++j, b >>= 1)
                if ((b & 1) != 0)
                    result[i][k++] = a[j];
        }
        System.out.println(Arrays.deepToString(result));
    }

}
