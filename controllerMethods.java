import Algebra.*;
import Statistics.*;
import Trigonometry.*;
import Misc.*;
import java.util.Scanner;

public class controllerMethods {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static Scanner sc = new Scanner(System.in);
    public static Boolean repeat = false;

    static void mainMethod() {
        do {
            System.out.println(
                    ANSI_PURPLE + "Do you want statics mode or algebra mode?" + "\nAlgebra = Sets of calculator for Algebra problems"
                            + "\nStat = Sets of statistic calculators" + "\nTrig = Sets of Trigonometry calculators" + "\nMisc = Random basic misc stuff" + "\nList = If you want to list all of the methods that are available"+ ANSI_RESET);
            String mainChoice = sc.nextLine();
            if (mainChoice.equalsIgnoreCase("Algebra")) {
                algebraMethods();
                } else if (mainChoice.equalsIgnoreCase("Stat")) {
                statisticMethods();
            } else if (mainChoice.equalsIgnoreCase("trig")){
                trigonometryMethods();
            } else if (mainChoice.equalsIgnoreCase("Misc")) {
                misc();
            }  else if (mainChoice.equalsIgnoreCase("List")) {
                list();
            }
            else {
                System.out.println(ANSI_RED + "The choice you entered is invalid. Pick Algebra or Stat or Trig or Misc" + ANSI_RESET);
            }
        } while (true);
    }
    static void algebraMethods() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Factor/GCF/SQR/PS/Quad/CR/DOTS)"
                    + "\nFactor = Find the factor of a number"
                    + "\nGCF = Find the greatest common factor of a number"
                    + "\nSQR = Find the square root of a number"
                    + "\nPS = Check if the number is a perfect square and return the square root"
                    + "\nQuad = Solve a quadratic equation"
                    + "\nExpo = Evaluate the given exponent"
                    + "\nFac = Factorial of a given number"
                    + "\nCR = Cube root of a given number"
                    + "\nDOTS = Difference Between Two Squares"
                    + "\nRFOIL = Factors a quadratic expression through reverse foil"
                    + "\nMain = Return to the main menu"
                    + ANSI_RESET);
            String answer = sc.nextLine();
            // if the input is y, set repeat program to true otherwise exit
            if (answer.equalsIgnoreCase("Factor")) {
                factorFinder.factorFinder();
            }
            else if (answer.equalsIgnoreCase("GCF")) {
                GCFfinder.GCFfinder();
            }
            else if (answer.equalsIgnoreCase("SQR")) {
                squareRoot.squareRoot();
            }
            else if (answer.equalsIgnoreCase("Expo")) {
                exponent.exponent();
            }
            else if (answer.equalsIgnoreCase("Quad")) {
                quadratic.quadratic();
            }
            else if (answer.equalsIgnoreCase("Fac")) {
                Fac.Fac();
            }
            else if (answer.equalsIgnoreCase("CR")) {
                CR.CR();
            }
            else if (answer.equalsIgnoreCase("DOTS")) {
                DOTS.DOTS();
            }
            else if (answer.equalsIgnoreCase("rfoil")) {
                foil.foil();
            }
            else if (answer.equalsIgnoreCase("Main")) {
                mainMethod();
            }
            else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
            }
            repeat = true;
        } while (true);
    }

    static void statisticMethods() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Stat)" + "\nStat = Finds the common information of a data set" + "\nMain = Return to the main menu"+ ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
            else if (answer.equalsIgnoreCase("stat")){
                generalStat.generalStat();
            }
            else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
            }
        } while (true);
    }

    static void trigonometryMethods() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Avg)" +
                    "\nCOS = Finds the cosine of the specified value." + "\nPT = Calculates the hypotenuse using the pythagorean theorem" + "\nMain = Return to the main menu"+ ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("cos")){
                cos.cos();
            }
            else if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
            else if (answer.equalsIgnoreCase("PT")){
                PT.PT();
            }
            else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
            }
        } while (true);
    }

    static void misc() {
        do {
            System.out.println(ANSI_PURPLE + "Which tool do you want to use? (Avg/PI/PS/RNG)" + "\nPI = Shows PI" + "\nPS = Checks if a number is perfect square"+ "\nRNG = Random Number Generator" + "\nMain = Return to the main menu" + "\nLEM = Represent linear equation in matrix form"+ ANSI_RESET);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("PI")){
                PI.pi();
            }
            else if (answer.equalsIgnoreCase("PS")){
                perfectSquare.PerfectSquare();
            }
            else if (answer.equalsIgnoreCase("Main")){
                mainMethod();
            }
            else if (answer.equalsIgnoreCase("RNG")) {
                RNG.RNG();
            }
            else if (answer.equalsIgnoreCase("LEM")) {
                LEM.LEM();
            }
            else {
                System.out.println(ANSI_RED + "\nThe choice you entered is invalid. Pick one from below" + ANSI_RESET);
            }
        } while (true);
    }

    static void list() {
        System.out.println(ANSI_BLUE + "--CURRENT AVAILABLE TOOLS--\n" +
                "\n" +
                "Algebra - Factor = Find the factor of a number\n" +
                "\n" +
                "Algebra - GCF = Find the greatest common factor of a number\n" +
                "\n" +
                "Algebra - SQR = Find the square root of a number\n" +
                "\n" +
                "Algebra - Quad = Solve a quadratic equation\n" +
                "\n" +
                "Algebra - Expo = Evaluate the given exponent\n" +
                "\n" +
                "Algebra - Fac = Factorial of a given number\n" +
                "\n" +
                "Algebra - CR = Cube root of a given number\n" +
                "\n" +
                "Algebra - SC = Simple calculator to calculate simple 2 term equations\n" +
                "\n" +
                "Algebra - DOTS = Difference Between Two Squares\n" +
                "\n" +
                "Algebra - RFOIL = Factors a quadratic expression through reverse foil\n" +
                "\n" +
                "Statistics - Stat = Finds the common values of a set of data(IQR, outliers, stdev, etc)\n" +
                "\n" +
                "Trigonometry - COS = Calculates the cosine of a given number\n" +
                "\n" +
                "Trigonometry - PT = Calculates the hypotenuse using the pythagorean theorem\n" +
                "\n" +
                "Misc - PS = Check if the number is a perfect square\n" +
                "\n" +
                "Misc - PI = List the numbers of PI\n" +
                "\n" +
                "Misc - RNG = Random Number Generator\n"
                + ANSI_RESET);

    }
}
