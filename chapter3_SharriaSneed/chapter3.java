import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class chapter3 {
    /*
    Name: Sharri'a Sneed
    Date: 9/2/2023 
    Course: ITSE 2317
    Description: Create a math tutor that lets the user practice adding or subtracting two random numbers
     */
    public static void main(String[] args){
        //Initalizing variables needed to save the numbers for the program.
        Scanner userInput = new Scanner(System.in);
        int userChoice = 0;
        int minVal = 1;
        int maxVal = 500;
        int range = maxVal - minVal + 1;
        int ranNum1 = (int)(Math.random() * range) + minVal;
        int ranNum2 = (int)(Math.random() * range) + minVal;
        int userAns = 0;
        //Ask the user whether they want to add or subtract
        System.out.print("Would you like to practice adding(1) or subtracting(2)?\n>> ");
        userChoice = userInput.nextInt();
        //Checks whether the user chose to add...
        if (userChoice == 1){
            //Prompts the user to answer the upcoming question
            System.out.println("\nPlease answer the following question");
            //Creates a variable that holds the correct answer to the problem
            int correctAns = ranNum1 + ranNum2;
            //Displays the problem for the user to solve
            System.out.print(ranNum1 + " + " + ranNum2 + " = \n>> ");
            userAns = userInput.nextInt();
            //Checks if the user's answer was correct
            if (userAns == correctAns){
                System.out.println("Correct! " + ranNum1 + " + " + ranNum2 + " = " + correctAns + "!");
            }
            //If the answer is not correct...
            else{
                System.out.println("That is incorrect. The correct answer is " + correctAns + ".");
            }
        }
        //Checks whether the user chose to subtract...
        else if (userChoice == 2){
            //Prompts the user to answer the upcoming question
            System.out.println("\nPlease answer the following question");
            //Creates a variable that holds the correct answer to the problem
            int correctAns = ranNum1 - ranNum2;
            //Displays the problem for the user to solve
            System.out.print(ranNum1 + " - " + ranNum2 + " = \n>> ");
            userAns = userInput.nextInt();
            //Checks if the user's answer was correct
            if (userAns == correctAns){
                System.out.println("Correct! " + ranNum1 + " - " + ranNum2 + " = " + correctAns + "!");
            }
            //If the answer is not correct...
            else{
                System.out.println("That is incorrect. The correct answer is " + correctAns + ".");
            }
        }
        //Checks whether the user chose an invaid choice
        else{
            System.out.println("That was not a vaild input.");
        }
        userInput.close();
    }
}
