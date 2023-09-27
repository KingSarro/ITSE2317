import java.util.Scanner;

//Sharri'a Sneed
//ITSE 2317
//9-27-23
//Desc: Program made to calculate the average water bill over the course of x years
public class Midterm_averageRainfall {
	public static void main(String[] args) {
		//Calls the displayResults
		displayResults();
	}//close main method
	
/*  [Created to hold returned values from other methods and to display calculated results to the user] */
	static void displayResults() {
		//created an Scanner object to get the user's input
		Scanner userInput = new Scanner(System.in);
		//Initialized variables used to hold the calculated information
		int years = 0;
		double totalBill = 0;
		double averageBill = 0;
		
		//Saves the value of getYears to the variable years
		years = getYears(userInput);
		//Saves the value of calculateTotalRainfall to the variable totalRainfall
		totalBill = calculateTotalWaterBill(userInput, years);
		//Saves the value of calculateAverageRainfall to the the variable averageRainfall
		averageBill = calculateAverageWaterBill(years, totalBill);
		
		//closes the Scanner object
		userInput.close();
		
		//Displays the result of the calculated average rainfall to the user
		System.out.println();
		System.out.print("The average water bill price over " + years + " years is : " + averageBill);
		
	}//closes the displayResults method
	
/*  [Created method to get how many years the user would like to calculate]  */
	static int getYears(Scanner scannerObject) {
		//Initialized variables to hold required variables for the program
		int years = 0;
		
		//Prompts the user to input a value for the number of years they wish to calculate
		System.out.print("Please enter the period of years you wish to calculate: \n>>  ");
		//While the value of years is not a valid answer, run this loop...
		while ( !(years >= 1) ) {//1st while loop
			//takes the user's input and saves it to years
			years = scannerObject.nextInt();
			if( !(years >= 1)) {//1st if statement
				//Displays an error message to tell the user the correct info to put in
				System.out.println();
				System.out.print("Please enter a whole number above zero: \n>> ");
			}//closes 1st if statement
			else {
				//do nothing
			}
		}//closes 1st while loop
		//Return the value of years to where the method was called
		return years;
	}//closes getYears method
	
/*  [Created method to calculate the total amount of rainfall over the course of x years]  */	
	static double calculateTotalWaterBill(Scanner scannerObject, int years) {
		
		//Initialized a variable to hold the calculated values inputed by the user
		double inputedCost = -1; //To make sure that a incorrectly inputed value doesn't mess up the calculation
		double totalCost = 0;
		//Initialized a variable to be used as a counter for the for-loops
		int yCounter = 1;
		
		//Prompts the user to input the rainfall for the months of x year
		//Until we reach(go past) the number of years given, run this loop...
		for(; yCounter <= years; yCounter++ ) {//the 1st for-loop
			//Initialized a variable to be used as a counter for the for-loops
			int mCounter = 1;
			
			System.out.println("Year " + yCounter + ": ");
			//until we reach(go past) the 12th month, run this loop...
			for(; mCounter <= 12; mCounter++) {//the 2nd for-loop
				System.out.print("\n\tEnter the rainfall of month " + mCounter + ": \n\t\t>> ");
				//While the variable inputedRain does not hold a valid value, run this loop...
				while( !(inputedCost >= 0) ) {
					//saves the user's input to the variable inputedRain
					inputedCost = scannerObject.nextDouble();
					//If the variable inputedRain does not hold a valid value, run this loop...
					if(!(inputedCost >= 0)) {
						//Displays an error message to tell the user the correct info to put in
						System.out.println();
						System.out.print("\tPlease enter a positve number or 0: \n\t\t>> ");
					}//closes the 1st if statement
				}//closes the 1st while loop
				//Adds the value of inputedRain to the value of totalRain
				totalCost += inputedCost;
				//resets the value of inputed rain
				inputedCost = -1;
			}//closes the 2nd for-loop
		}//closes the 1st for-loop
		
		//returns the value of totalRain to where the method was called
		return totalCost;
	}//closes calculateTotalRainFall
	
/*  [Created method to calculate the average of total amount of rainfall of x years]  */	
	static double calculateAverageWaterBill(int years, double totalWaterBill) {
		//Initialized variables to hold the calculated values
		int totalMonths = years *12;
		double averageWatterBill = 0;
		//Gets the average of the totalRainfall
		averageWatterBill = totalWaterBill / totalMonths;
		//returns the value of averageRainfall to where the method was called
		return averageWatterBill;
	}

}//closes Midterm_averageRainfall
