//package Launch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

class Main {
    public static String readInputStreamWithTimeout(InputStream is, byte[] b, int timeoutMillis, PadUnit[] padArray, String padInfo, String rocketInfo)
            throws IOException {
        int PadNumber = Integer.parseInt(padInfo);
        PadUnit pad = padArray[PadNumber];
        int rocketName = Integer.parseInt(rocketInfo);
        int bufferOffset = 0;
        long maxTimeMillis = System.currentTimeMillis() + timeoutMillis;
        String action = "";
        boolean notReceiveInput = true;
        while (System.currentTimeMillis() < maxTimeMillis && bufferOffset < b.length && notReceiveInput) {
            int readLength = java.lang.Math.min(is.available(), b.length - bufferOffset);
            // can alternatively use bufferedReader, guarded by isReady():
            int readResult = is.read(b, bufferOffset, readLength);
            bufferOffset += readResult;
            if (bufferOffset != 0) {
                notReceiveInput = false;
            }
        }
        action = new String(b);
        //System.out.println(action);
        if (notReceiveInput == true) {
            controller.reset(pad, rocketName);
            //System.out.println("reset");
            return ("Time out case");
        }
        // digit or not, check input later. return what ever the String is
        String result = "";
        int actionLength = action.length();
        for (int k = 0; k < actionLength;k++)
        {
            boolean solveIf1 = true;
            while (Character.isDigit(action.charAt(k)) && solveIf1)
            {
                result += action.charAt(k);
                solveIf1 = false;
            }
        }
        return result;
    }


    public static boolean checkPadNumber(String inputNumOfPad, String padNumber) {
        int NumberOfPad = Integer.parseInt(inputNumOfPad);
        for (int k = 0; k <= NumberOfPad; k++) {
            boolean rightPadNum = padNumber.equals(Integer.toString(k));
            if (rightPadNum) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkInputRocketNumber(String rocketNum) {
        boolean rocketNumEqual1 = (!rocketNum.equals("1"));
        boolean rocketNumEqual2 = (!rocketNum.equals("2"));
        if (rocketNumEqual1 && rocketNumEqual2) {
            return false;
        }
        return true;
    }

    /**
     * This method gets the current state of the pad and displays possible actions on the pad.
     *
     * @param rocketName
     * @param padArray
     * @param inputPadName
     * @param inputNumOfPad
     * @throws InvalidInputException
     */
    public static void CheckPadNameAndRocketNumberThenInputRocketAction(String rocketName, PadUnit[] padArray, String inputPadName, String inputNumOfPad) throws InvalidInputException
    //Check input padName and rocketInfo
    {
        if (checkPadNumber(inputNumOfPad, inputPadName) == false) { // Check padNumber
            throw new InvalidInputException("This Pad is not registered");
        } else {
            if (checkInputRocketNumber(rocketName) == false) {//Check rocketNumber
                throw new InvalidInputException("Rocket number can only be 1 or 2");
            } else {
                int rocketNumber = Integer.parseInt(rocketName);
                int padNumber = Integer.parseInt(inputPadName);
                ControlButtonState currentState;
                if (rocketNumber == 1) {
                    currentState = controller.map.get(padArray[padNumber]).getState1();
                } else {
                    currentState = controller.map.get(padArray[padNumber]).getState2();
                }
                if (currentState == ControlButtonState.armedLaunchAvailable) {
                    System.out.println("Input2: Enter action (only 2('armed') and 4('reset') are available)");
                } else if (currentState == ControlButtonState.inactive) {
                    System.out.println("Input2: Enter action (only 1('activate') and 4('reset') are available)");
                } else if (currentState == ControlButtonState.launchAvailable) {
                    System.out.println("Input2: Enter action (only 2('armed'), 3('launch') and 4('reset') are available)");
                }
            }
        }
    }

    public static void terminateInstruction() {
        System.out.println("TERMINATE THE PROCESS ANYTIME BY ENTERING '0'");
        System.out.println("TERMINATE THE PROCESS ANYTIME BY ENTERING '0'");
        System.out.println("TERMINATE THE PROCESS ANYTIME BY ENTERING '0'");
    }

    public static void println() {
        System.out.println("------------------------------------------------");
    }

    public static boolean actionValidity(String action)
    {
        boolean actionIs0 = action.equals("0");
        boolean actionIs1 = action.equals("1");
        boolean actionIs2 = action.equals("2");
        boolean actionIs3 = action.equals("3");
        boolean actionIs4 = action.equals("4");
        if ((!actionIs0) && (!actionIs1) && (!actionIs2)
                && (!actionIs3) && (!actionIs4))
        {
            return false;
        }
        return true;
    }
    public static void showState(int NumberOfPad, PadUnit[] padArray) {
        System.out.println("Rocket Pad Control Button system table");
        //int NumberOfPad = Integer.parseInt(inputNumOfPad);
        for (int j = 1; j <= NumberOfPad; j++) {
            println();
            ControlButtonState stateRocket1 = controller.map.get(padArray[j]).getState1();
            ControlButtonState stateRocket2 = controller.map.get(padArray[j]).getState2();
            System.out.println("Pad " + j + "Rocket 1: " + "Control Button State: " + stateRocket1);
            System.out.println("Pad " + j + "Rocket 2: " + "Control Button State: " + stateRocket2);
        }
    }

    public static Controller controller = new Controller();

    public static void main(String[] args) throws IOException {
        String rocketInfo;
        int MaxPad = 8;
        String action;
        terminateInstruction();
        println();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean haltProgram1 = true;
        boolean haltProgram2 = true;
        int intNumOfPad = 0;
        int padNumber = 0;
        int rocketNumber = 0;
        int rocketAction = 0;
        while (haltProgram1) { //user entered exit key "#"
            try {
                System.out.println("Enter number of pad (Maximum 8)");
                String inputNumOfPad = reader.readLine();
                boolean haltProgram = inputNumOfPad.equals("0");
                if (haltProgram) {
                    haltProgram1 = false;
                }
                boolean createPadUnitManagerIfContinueProgram = true;
                while (haltProgram2 && haltProgram1 && createPadUnitManagerIfContinueProgram) {
                    PadUnitManager padUnitManager = new PadUnitManager(inputNumOfPad);//Checking input validity here
                    intNumOfPad = Integer.parseInt(inputNumOfPad);
                    while (haltProgram2 && haltProgram1) { //user entered exit key "0"
                        try {
                            println();
                            System.out.println("Input0: Enter pad name");
                            String inputPadName = reader.readLine();
                            haltProgram = inputPadName.equals("0");
                            if (haltProgram) {
                                haltProgram2 = false;
                                haltProgram1 = false;
                            }
                            // A big If is here
                            boolean checkHaltProgram2Once = true;
                            while (haltProgram2 && checkHaltProgram2Once) {
                                System.out.println("Input1: Enter rocket number (1 or 2)");
                                rocketInfo = reader.readLine();
                                haltProgram = rocketInfo.equals("0");
                                if (haltProgram) {
                                    return;
                                }
                                //input rocket action
                                CheckPadNameAndRocketNumberThenInputRocketAction(rocketInfo, padUnitManager.padArray, inputPadName, inputNumOfPad);
                                //Pass String in to check input validity
                                //Check PadName, RocketNumber
                                rocketNumber = Integer.parseInt(rocketInfo);
                                padNumber = Integer.parseInt(inputPadName);
                                action = reader.readLine();
                                boolean checkActionValidityOnce = true;
                                while (actionValidity(action) && checkActionValidityOnce)
                                //action is checked here
                                    //to come to this place, all input must be valid already
                                {
                                    //Not doing if due to tool challenge
                                    rocketAction = Integer.parseInt(action);
                                    boolean ActionIsTimeout = action.equals("Time out case");
                                    haltProgram = (rocketAction == 0);
                                    if (haltProgram) {
                                        haltProgram2 = false;
                                        haltProgram1 = false;
                                    }
                                    boolean runWhileLoopOnce2 = true;
                                    while (haltProgram2 && runWhileLoopOnce2) {
                                        //"Activate" case ---------------------------------------------------------------
                                        if (rocketAction == 1) {//Activate
                                            //padNumber and padAction were checked already
                                            padUnitManager.takeAction(intNumOfPad, padNumber, rocketNumber);
                                            //Pass string in function to check input validity
                                            //To not pass string in, meaning to pass integer, have to check input before
                                            //have a inputCheck function: validity of pad, rocket and action

                                            println();
                                            System.out.println("Enter action for rocket " + rocketInfo +
                                                    "(only 2('armed') and 4('reset') are available) (The system of this rocket will be reset in 10 seconds if no more action is executed.");
                                            byte[] inputData = new byte[20];
                                            //if input more than 20, then off the process once though the program can continue normally
                                            //If the input in readInputStreamWithTimeout is more than 20 character (bytes)
                                            //inputData variable will take only 20 character, leaving all those redundant character(s)
                                            //will be taken as input0: Enter pad name
                                            String nextAction = readInputStreamWithTimeout(System.in, inputData, 10000, padUnitManager.padArray, inputPadName, rocketInfo);
                                            //System.out.println("next action: " + nextAction);
                                            boolean nextActionIsTimeout = nextAction.equals("Time out case");
                                            if (actionValidity(nextAction) == true) {
                                                int intNextAction = Integer.parseInt(nextAction);
                                                if (intNextAction == 0) {
                                                    haltProgram2 = false;
                                                    haltProgram1 = false;
                                                    //continue; //do structure programming, no break, not continue, i.e., c-like code should not be used.
                                                } else if (intNextAction == 1) {
                                                    throw new InvalidInputException("Control Buttons are activated already");
                                                } else {
                                                        controller.takeAction(intNumOfPad, padUnitManager.padArray, padNumber, rocketNumber, intNextAction, nextActionIsTimeout);
                                                        println();
                                                }
                                            }
                                            else
                                            {
                                                throw new InvalidInputException("Action can only be 1('activate'), 2('armed'), 3('launch'), or 4('reset')");
                                            }
                                            //If not activate------------------------------------------------------------------
                                        }
                                        else {
                                            controller.takeAction(intNumOfPad, padUnitManager.padArray, padNumber, rocketNumber, rocketAction, ActionIsTimeout);
                                            println();
                                        }
                                        showState(intNumOfPad, padUnitManager.padArray);
                                        runWhileLoopOnce2 = false;
                                    }
                                    checkHaltProgram2Once = false;
                                    checkActionValidityOnce = false;
                                }
                                if (checkActionValidityOnce== true)
                                {
                                    throw new InvalidInputException("Action can only be 0(exit program), 1(activate), 2(armed launch), 3(launch), 4(reset)");
                                }
                            }
                            } catch(InvalidInputException e){
                                System.out.println(e);

                        }
                        createPadUnitManagerIfContinueProgram = false;
                    }
                }
            } catch (InvalidInputException e) {
                System.out.println(e);
            }
        }
    }
}
/* idea for checking input outside functions:
Make a chekingAllInputFUnction = boolean
inside function
if (checkAllInput = false) throws exception, else continue action

 */
/*Structure if {} else
is replaced by
while (if condition && flag to stop while one time){} if (flag to stop while is not raised) {}
-----                                                 --
if    (if condition)                                  else
 */