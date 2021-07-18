/*
    Author: Brady Lamson, Milah Thomas
    Date: FILL THIS IN BEFORE SUBMISSION*******
    BradyLamson_03_Quiz does whatever it needs to do
    Project #3
    IDE: IntelliJ IDEA 2021.1.2 (Community Edition)
    Vocabulary Word:
    Inspirational Quote:
 */

/*
    TODO CONVERT THIS TO AN ARRAY-FOCUSED SOLUTION.
    TODO SETUP PRINTREPORT() METHOD AND FORMAT OUTPUT ACCORDINGLY.
    This should flow pretty smooth once the array is populated. Use
    work in grocery.java as a base!
 */

// Imports ********************************************************************
import java.util.ArrayList;
import java.util.Scanner;

// Begin class BradyLamson_03_Quiz ********************************************
public class BradyLamson_03_Quiz    {
    // Instance variable declarations -----------------------------------------
    private int gradeCounter;
    private double runningTotal;
    private String userName;
    private double average;
    private final Scanner scan = new Scanner(System.in);    // Access Keyboard
    private static ArrayList<Double> gradeList = new ArrayList<>();

    // End general variable declarations --------------------------------------

    // Default Constructor ****************************************************
    public BradyLamson_03_Quiz()    {
        gradeCounter = 0;
        runningTotal = 0;
        userName = "";
    }   // End default Constructor

    // print intro method *****************************************************
    private static void printIntro() {
        // This prints out a simple introduction on how the program works.
        System.out.println(
                "\nThis is a program that does things. \n"
                + "It does stuff like -insert stuff- \n");
    }   // End printIntro method

    // scan name method *******************************************************
    private void scanName()    {
        // This method gets the name of the user.
        System.out.println("Please input your name, or press "
                + "<Enter> to exit the program. ");
        userName = scan.nextLine();

        if (userName.equals(""))    {
            System.exit(0);
        }   // End if


    }   // End scanName method

    // get quiz grade method **************************************************
    private void getQuizGrades()  {
        double currentInput;

        // TODO Set this up to have scan.nextDouble() add to array
        for (int index = 1; index < 10; count++)  {
            // System.out.print("Quiz #" + count + ": ");
            gradeList.add(scan.nextDouble()); // user inputs a double
            if (gradeList[index-1] < 0)   {
                break;
            }
            runningTotal += gradeList[index-1];
            // gradeCounter++;
        }
        // average = runningTotal / gradeCounter;
    }

    // Assign letter grade method *********************************************
    private void assignLetterGrade()  {
        String letterGrade = "";
        double average; 

        getQuizGrades();
        // TODO FIX THIS
        average = runningTotal / length.gradeList;


        if (this.average >= 90 && this.average <= 100)  {
            letterGrade = "A";
        }   // End if
        else if (this.average >= 80 && this.average < 90)   {
            letterGrade = "B";
        }   // End else
        else if (this.average >= 70 && this.average < 80)   {
            letterGrade = "C";
        }   // End else
        else if (this.average >= 60 && this.average < 70)   {
            letterGrade = "D";
        }   // End else
        else if (this.average < 60)   {
            letterGrade = "F";
        }   // End else
    }   // End assignLetterGrade method

    // printReport method *****************************************************
    public void printReport() {
        System.out.println("\nQuiz Report for " + userName "\n");

        for (int index = 0; index < length.gradeList - 1; index++) {
            System.out.println("\nQuiz #" 
                + (index+1) 
                + ": " 
                + gradeList[index]);
        }
        // TODO: cREATE DECIMAL FORMATTER FOR ANSWER (#.0)
        System.out.println("\nQuiz average: " 
            + formatter.decimalformat(average)
            + "%%\n"
            + "Quiz grade: " + letterGrade);
    }


    // grade quizzes method ***************************************************
    public void gradeQuizzes() {
        printIntro();
        scanName();
        assignLetterGrade();
        printReport();
    }   // end gradeQuizzes method

    // main method ************************************************************
    public static void main(String[] args)  {
        BradyLamson_03_Quiz myQuiz = new BradyLamson_03_Quiz();
        myQuiz.gradeQuizzes();
    }   // End main
}   // End BradyLamson_03_Quiz (class)
