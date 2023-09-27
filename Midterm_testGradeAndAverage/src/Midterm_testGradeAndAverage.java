import java.text.DecimalFormat;
import java.util.Scanner;
//Sharri'a Sneed
//9-27-23
//ITSE 2317
//Created a program to print out a message based on the 5 (user inputed) batting score along with
// the batting score average 

public class Midterm_testGradeAndAverage {
	public static void main(String args[]) {
		displayResults();
	}//closes main method
	
	
	static void displayResults(){
		DecimalFormat battingScore = new DecimalFormat(".000");
		//Initialized 2 variables to hold two calculated values
		double batTotal = 0;
		double batAverage = 0;
		//Saves the returned value of getGrade to gradeTotal
		batTotal = getGrade();
		//Saves the returned value of calculateAverage to gradeAverage
		batAverage = calculateAverage(batTotal);
		//Displays the message of the grades average to the user through the console
		System.out.println("--------------------------------------------");
		System.out.println("The batting score average is:  " + battingScore.format(batAverage));
	}//closes displayResults method
	
	
	static double getGrade() {
		//Created a Scanner object to get inputs from the user
		Scanner userInput = new Scanner(System.in);
		//Initializes variables to hold the grades and their calculation 
		double batScore = 0;
		int counter = 1;
		double batAvg = 0;
		
		//while the 5th grade hasn't been entered...
		while (counter != 5+1) {
			//Prompts the user it input the 1 of the 5 grades
			System.out.print("Please enter score number " + counter + ": ");
			batScore = userInput.nextDouble(); //saves the user's input to grade
			batAvg += batScore;// adds the inputed grade to gradeAverage
			calculateBattingAverage(batScore);//calls to get the letter grade of the inputed number grade
			//Adds 1 to the counter
			counter++;
		}//closes the 1st while loop 
		userInput.close(); //Closes the user object
		//returns the value of grade total to where this method was called from
		return batAvg;
	}//closes getGrade method
	
	
	static void calculateBattingAverage(double battingScore){
		if (battingScore >= .303 && battingScore <= .338) {
			System.out.print("\t> Excellent Average\n");
		}//closes if statement
		else if (battingScore >= .267 && battingScore < .302 ) {
			System.out.print("\t> Good Average\n");
		}//closes 1st else if statement
		else if (battingScore >= .231 && battingScore < .266) {
			System.out.print("\t> Normal\n");
		}//closes 2nd else if statement
		else if (battingScore >= .195  && battingScore < .230) {
			System.out.print("\t> Below Average\n");
		}//closes 3rd else if statement
		else {
			System.out.print("\t> Needs Improvement\n");
		}//closes else statement
		
	}//closes displayResults method

	
	static double calculateAverage(double totalBattingScore) {
		//Initialized a variable to hold the calculated value
		double averageOf5 = 0;
		//Divide the sum of all 5 grades by 5 to get the average of them
		averageOf5 = totalBattingScore / 5;
		//return the value of averageOf5 to where the method was called
		return averageOf5;
	}//closes calculateAverage method
}//Closes Midterm_testGradeAndAverage class
