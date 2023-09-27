import java.text.DecimalFormat;
import java.util.Scanner;

//Sharri'a Sneed
//ITSE 2317
//9-27-23
//Create a program to calculate how much money someone would end with for x (user inputed amount)
//if their money doubled everyday, starting with 1 dime

public class Midterm_PenniesForPay {
	public static void main(String args[]) {
		//calls the function getNumberOfDays, which was created to talk to the user
		getNumberOfDays();
	}//closes main method
	
	//Created a method to get how many days the user wants to calculate for
	static void getNumberOfDays() {
		//Creates a Scanner object to get the user's input
		Scanner userInput = new Scanner(System.in);
		//Initializes variables to hold the number of days, current day, and current money
		int numOfDays = 1;
		double money = 0.10;
		int curDay = 1;
		
		//Prompts the user to input the number of days they wish to check
		System.out.print("How many days would you like to calculate for? \n>> ");
		numOfDays = userInput.nextInt();//Saves the user inputed value to numOfDays
		userInput.close();//closes Scanner object named userInput
		System.out.println();
		
		//calls the function displayDayResults, which was created to display the calculated results
		//to the user trough the console
		displayDayResults(numOfDays,curDay,money);
	}//closes getNumberOfDays
	
	//Created a method to display the result of the day
	static void displayDayResults(int totalDays, int currentDay, double currentMoney) {
		DecimalFormat moneyFormat = new DecimalFormat("0.00");
		//While the last day hasn't been reached, run this...
		while (currentDay != totalDays+1) {
			//If it's the first day, do this...
			if (currentDay == 1) {
				System.out.println("Day " + currentDay + ":\t $" + moneyFormat.format(currentMoney));
			}//closes if statement
			
			//If it's not the first day, do this...
			else {
				//call the calculatePay function and save its returned value to current money
				currentMoney = calculatePay(currentMoney);
				//displays the results of the pays calculations with its corresponding day
				System.out.println("Day " + currentDay + ":\t $" + moneyFormat.format(currentMoney));
			}//Closes else statement
			
			//Adds 1 to the current day
			currentDay++;
		}//closes 1st while loop
	}//closes the displayDayResults
	
	//Created a method to calculate how much money is earned each day
	static double calculatePay(double currentMoney) {
		//Initialized a variable to hold the calculated value
		double newMoney = 0;
		//new money amount id double the current money amount
		newMoney = currentMoney + currentMoney;
		//return the value of new money where the function was called
		return newMoney;
	}//closes calculatePay method
}//Closes Midterm_PenniesForPay class
