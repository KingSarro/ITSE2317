import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

//Name: Sharri'a Sneed
//Course: ITSE 2317
//Date: 9/16/23
//Desc: 

public class week4PaintCompany {
	public static void main(String[] args) {
		//Creates a scanner class object to take the user's input
		Scanner userInput = new Scanner(System.in);
		//Creates a decimal formater for converting extra amounts of paint or hours
		DecimalFormat rounded = new DecimalFormat("0");
		//Rounds decimals to round up regardless of it being over .5
		rounded.setRoundingMode(RoundingMode.CEILING);
		//Initializes variables for the program
		int roomAmount = 0;
		double squareFtTotal = 0;
		double gallonAmount = 0;
		double paintPrice = 0;
		int paintAmount = 0;
		
		//Prompts the user to enter the basic job information necessary for the job
		System.out.printf("%s%n%s", "Please enter the number of rooms that need painting: ", ">> ");
		roomAmount = userInput.nextInt();
		System.out.printf("%n%s%n%s", "What is the price of paint you want use: ", ">> $");
		paintPrice = userInput.nextDouble();
		
		//Asks the users the square footage of each room
		for (int counter = 1; counter < roomAmount + 1; counter++) {
			System.out.printf("%n%s%d%n%s", "What is the square footage of wall space in room ", counter, ">> ");
			//Add the new double amount to the variable squareFtTotal
			squareFtTotal += userInput.nextDouble();
			
			//debugStatement
			System.out.println("Room " + counter + ": " + squareFtTotal);
		}
		
		gallonAmount = calculateGallon(squareFtTotal);
		
	}// closes main method
	
	
	public static double calculateGallon(double squareFt){
		DecimalFormat rounded = new DecimalFormat("0");
		rounded.setRoundingMode(RoundingMode.CEILING);
		
		double gallonAmount = 0;
		gallonAmount = squareFt / 100;
		//debug code
		System.out.println(gallonAmount);
		System.out.println(rounded.format(gallonAmount));
		//return amount
		return gallonAmount;
		
	}//closes calculateGallon method
	public static int calculateLabor(int squareFt){
		
	}//closes calculateGallon method
	public static int paintCost(int sqFt, int paintPrice){
		
	}//closes paintCost method
	public static int laborCost(int sqFt){
		
	}//closes laborCost method
	public static int totalCost(int laborCost, int paintCost){
		
	}//closes paintCost method
	
}// closes week4PaintCompany class
