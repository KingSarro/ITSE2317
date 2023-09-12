import java.io.*;
import java.util.Scanner;
import java.util.Random;

/*
Name: Sharri'a Sneed
Date: 9/12/2023
Course: ITSE 2317
Description: 
*/

public class Chapter4{
	public static void main(String[] args) {
		//Initialize variables for the program
		Scanner userInput = new Scanner(System.in);
		int minVal = 1;
		int maxVal = 100;
		int range = maxVal - minVal + 1;
		int ranNum = (int)(Math.random() * range) + minVal;
		int userGuess = 0;
		
		//Prompts the user to input a random whole number between 1 and 100
		System.out.print("Please guess a whole number between 1 and 100: \n>> ");
		userGuess = userInput.nextInt();
		//Makes a loop in case the user enters a number out of bound.
		while (userGuess < 1 || userGuess > 100) {
			System.out.print("\nInvalid Answer! Please enter a whole number between 1 and 100: \n>> ");
			userGuess = userInput.nextInt();
		}//ClosesWhileLoop
		//Makes a loop to keep asking for inputs until the user guesses the correct answer
		if (userGuess == ranNum) {
			System.out.print("\nCongrats! You guessed the correct number");
		}//Closes if statement
		else {
			while (userGuess != ranNum) {
				//Checks to see if the user entered a valid int
				if (userGuess < 1 || userGuess > 100) {
					System.out.print("\nInvalid Answer! Please enter a whole number between 1 and 100: \n\n>> ");
					userGuess = userInput.nextInt();
				}//Closes if statement
				//Checks to see if the userGuess is higher than the ranNum
				else if (userGuess > ranNum) {
					System.out.print("\nYour guess is too high! Enter another number:\n>> ");
					userGuess = userInput.nextInt();
				}//Closes else if statement
				//Checks to see if the userGuess is lower than the ranNum
				else if (userGuess < ranNum) {
					System.out.print("\nYour guess is too low! Enter another number:\n>> ");
					userGuess = userInput.nextInt();
				}//Closes else if statement
				//If all of the statements above are false...
				else {
					//Break out of the loop because the userGuess must be equal to the ranNum
					break;
				}//Closes the else statement
			}//Closes while loop
		}//Closes else statement
		
		//Displays that the user guessed the correct answer
		System.out.print("\nCongrats! You guessed the correct number.");
		//closes the scanner object
		userInput.close();
	}//ClosesMainMethod

}//ClosesChapter4Class
