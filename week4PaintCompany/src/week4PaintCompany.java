import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.lang.Math;

//Name: Sharri'a Sneed
//Course: ITSE 2317
//Date: 9/19/23
//Desc: Calculate the total cost of a paint job bases on the number of rooms and square footage

public class week4PaintCompany {
	public static void main(String[] args) {
		/*
		 * 
		//Creates a decimal formater for converting extra amounts of paint or hours
		DecimalFormat rounded = new DecimalFormat("0");
		//Rounds decimals to round up regardless of it being over .5
		rounded.setRoundingMode(RoundingMode.CEILING);
		
		 */
		//Creates a scanner class object to take the user's input
		Scanner userInput = new Scanner(System.in);
		//Initializes variables to save user inputs
		int roomAmount = 0;
		double squareFtTotal = 0;
		double paintPrice = 0;
		//Initializes variables to saved returned method values
		double totalGallonAmount = 0;
		double totalLaborHours = 0;
		double totalPaintCost = 0;
		double totalLaborCost = 0;
		double totalCost = 0;
		
	//Prompts the user to enter the basic job information necessary for the job
		//Ask the user to enter the number of rooms needed to be painted
		System.out.printf("%s%n%s", "Please enter the number of rooms that need painting: ", ">> ");
		//saves the user inputed value to the variable room amount
		roomAmount = userInput.nextInt();
		//Asks the user the price of a gallon of paint
		System.out.printf("%n%s%n%s", "What is the price of paint you want use (by the gallon): ", ">> $");
		//saves the user inputed value to the variable paint price
		paintPrice = userInput.nextDouble();
		
		//Asks the users the square footage of each room
		for (int counter = 1; counter < roomAmount + 1; counter++) {
			System.out.printf("%n%s%d%n%s", "What is the square footage of wall space in room ", counter, ">> ");
			//Add the new double amount to the variable squareFtTotal
			squareFtTotal += userInput.nextDouble();
			
			//debugStatement
			System.out.println("Room " + counter + ": " + squareFtTotal);
		}
		
		//calls the calculateGallonAmount function and saves the returned value to the variable gallonAmount
		totalGallonAmount = calculateGallonAmount(squareFtTotal);
		//calls the calculateLaborHours function and saves the returned value to the variable totalHours
		totalLaborHours = calculateLaborHours(squareFtTotal);
		//calls the calculatePaintCost function and saves the returned value to the variable paintCost
		totalPaintCost = calculatePaintCost(paintPrice, totalGallonAmount);
		//calls the calculateLaborCost function and saves the returned value to the variable totalLaborCost;
		totalLaborCost = calculateLaborCost(totalLaborHours);
		//calls the calculateTotalCost function and saves the returned value to the variable totalCost
		totalCost = calculateTotalCost(totalPaintCost, totalLaborCost);
		
		//Calls a method to display the results after calculations
		displayResults(totalGallonAmount, totalLaborHours, totalPaintCost, totalLaborCost, totalCost);
		//closes the Scanner object
		userInput.close();
	}// closes main method
	
	//Created a method to calculate how many gallons of paint will be needed
	//Created a method to calculate how many gallons of paint is needed to complete the job.
	static double calculateGallonAmount(double squareFt){
		//Initializes a variable to hold the calculated value
		double gallonAmount = 0;
		//Calculate the amount of gallons needed and saves it to the variable gallonAmount
		gallonAmount = squareFt / 100; //Every 100sqft = 1gallon
		//return the value of gallonAmount to where the method was called
		return Math.ceil(gallonAmount);
	}//closes calculateGallon method
	
	//Created a method to calculate how many hours the job will take
	//Created a method to calculate the amount of labor need
	static double calculateLaborHours(double squareFt){
		//Initializes variables to hold the calculated values
		double per100sqFt = 0;
		double workHours = 0;
		//Calculates each set of 100sqft
		per100sqFt = squareFt / 100; //Each 100sqft segment
		//Calculates how many hours are going to be worked
		workHours = per100sqFt * 8; //Each 100sqft segment is equal to 8hrs
		//returns the value of workHours to where the method was called
		return workHours;
		
	}//closes calculateGallon method
	
	//Created a method to calculate the total paint cost of the job
	static double calculatePaintCost(double paintPrice, double paintAmount){
		//Initializes a variable to hold the calculated value
		double paintCost = 0;
		//Calculates the total price of all the paint being bought
		paintCost = paintPrice * paintAmount;
		//returns the values of paintCost to where the method was called
		return paintCost;	
	}//closes paintCost method
	
	//Created a method to calculate the cost of labor for the job
	static double calculateLaborCost(double totalHours){
		//Initializes a variable to hold the calculated value
		double laborCost = 0;
		//Calculated the cost of labor per hour
		laborCost = totalHours * 20;
		//returns the value of laborCost to where the method was called
		return laborCost;
	}//closes laborCost method
	
	//Created a method to calculate the total cost of the whole job
	static double calculateTotalCost(double paintCost, double laborCost){
		//Initializes variable to hold the calculated value
		double totalCost = 0;
		//Calculates the total cost of the job by adding all the cost together
		totalCost = paintCost + laborCost;
		//returns the value of the totalCost to where the method was called
		return totalCost;
	}//closes paintCost method
	
	//Created a method to display the results of the job calculations
	static void displayResults(double totalPaint, double totalLaborHours, double totalPaintCost, double totalLaborCost, double totalCost) {
		//Creates a DecimalFormat to display the doubles in typical forms
		DecimalFormat moneyFormat = new DecimalFormat("0.00");
		DecimalFormat hourFormat = new DecimalFormat("0.0");
		DecimalFormat intFormat = new DecimalFormat("0");
		//Rounds decimals to round up regardless of it being over .5
		hourFormat.setRoundingMode(RoundingMode.CEILING);
		//Displays all the information about the job in the desired format
		System.out.print("\n\n");
		System.out.println("Number of gallons required: " + intFormat.format(totalPaint));
		System.out.println("Hours of labor required: " + hourFormat.format(totalLaborHours));
		System.out.println("Paint Cost: $" + moneyFormat.format(totalPaintCost));
		System.out.println("Labor Cost: $" + moneyFormat.format(totalLaborCost));
		System.out.println("----------------------------------------------------------");
		System.out.println("Total Cost of Job: $" + moneyFormat.format(totalCost));
		
	}//closes the displayResults method
}// closes week4PaintCompany class
