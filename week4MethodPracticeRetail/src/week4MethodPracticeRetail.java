import java.util.Scanner;
import java.text.DecimalFormat;

/*
 Name: Sharri'a Sneed
 Class: ITSE 2317
 Date: 9/16/23
 Desc: Calculate the retail markup price of an item
 */
public class week4MethodPracticeRetail {
	public static void main(String[] args) {
		//Creates a scanner object to take the user's inputs
		Scanner userInput = new Scanner(System.in);
		//Creates a decimalFormat object to format the decimal how I want
		DecimalFormat retailPriceFormated = new DecimalFormat("0.00");
		//Initializes the main variables of this method for the program
		double wholesaleCost = 0.0;
		double markupPercent = 0.0;
		double retailPrice = 0.0;
		
		//Prompts the user to enter the wholesale cost and the markup price
		System.out.printf("%s%n%s", "Please enter the wholesale cost of the item: ", ">> $");
		wholesaleCost = userInput.nextDouble();
		System.out.printf("%n%s%n%s%n%s", "Please enter the markup percent of the item: ","(If the markup is 50%, type .50)", ">> ");
		markupPercent = userInput.nextDouble();
		
		//Calls the calculateRetail method and saves its return value to the retailPrice variable
		retailPrice = calculateRetail(wholesaleCost, markupPercent);
		
		//Displays the retail price to the user
		System.out.print("\nThe retail price of this item is $" + retailPriceFormated.format(retailPrice) + ".");
		//System.out.printf("%n%s%f%s", "The retail price of this item is $", retailPrice, ".");
		
		//closes the scanner object
		userInput.close();
	}//Closes main method
	
	public static double calculateRetail(double wholesale, double markup) {
		//Initializes the variable 
		double markupAmount = 0.0;
		//calculates how much the item is being marked up
		markupAmount = wholesale * markup;
		//returns the sum of markup amount plus the wholesale cost
		return markupAmount + wholesale;
	}//Closes calculateRetail method
}//Closes week4MethodPracticeRetail class
