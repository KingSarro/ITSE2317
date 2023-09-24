import java.util.Scanner;
//Sharri'a Sneed
//9-23-23
//ITSE 2317
//Created a program to pint out the corresponding letter of 5 (user inputed) grades along with
// the grade average 

public class Midterm_testGradeAndAverage {
	public static void main(String args[]) {
		displayResults();
	}//closes main method
	
	
	static void displayResults(){
		//Initialized 2 variables to hold two calculated values
		double gradeTotal = 0;
		double gradeAverage = 0;
		//Saves the returned value of getGrade to gradeTotal
		gradeTotal = getGrade();
		//Saves the returned value of calculateAverage to gradeAverage
		gradeAverage = calculateAverage(gradeTotal);
		//Displays the message of the grades average to the user through the console
		System.out.println("--------------------------------------------");
		System.out.println("The average of the 5 grades is:     " + gradeAverage);
	}//closes displayResults method
	
	
	static double getGrade() {
		//Created a Scanner object to get inputs from the user
		Scanner userInput = new Scanner(System.in);
		//Initializes variables to hold the grades and their calculation 
		int grade = 0;
		int counter = 1;
		double gradeTotal = 0;
		
		//while the 5th grade hasn't been entered...
		while (counter != 5+1) {
			//Prompts the user it input the 1 of the 5 grades
			System.out.print("Please enter grade " + counter + ": ");
			grade = userInput.nextInt(); //saves the user's input to grade
			gradeTotal += grade;// adds the inputed grade to gradeAverage
			calculateLetterGrade(grade);//calls to get the letter grade of the inputed number grade
			//Adds 1 to the counter
			counter++;
		}//closes the 1st while loop 
		userInput.close(); //Closes the user object
		//returns the value of grade total to where this method was called from
		return gradeTotal;
	}//closes getGrade method
	
	
	static void calculateLetterGrade(int numberGrade){
		if (numberGrade >= 90 && numberGrade <= 100) {
			System.out.print("\t|  A\n");
		}//closes if statement
		else if (numberGrade >= 80 && numberGrade < 90) {
			System.out.print("\t|  B\n");
		}//closes 1st else if statement
		else if (numberGrade >= 70 && numberGrade < 80) {
			System.out.print("\t|  C\n");
		}//closes 2nd else if statement
		else if (numberGrade >= 60 && numberGrade < 70) {
			System.out.print("\t|  D\n");
		}//closes 3rd else if statement
		else {
			System.out.print("\t|  F\n");
		}//closes else statement
		
	}//closes displayResults method

	
	static double calculateAverage(double totalOfGrades) {
		//Initialized a variable to hold the calculated value
		double averageOf5 = 0;
		//Divide the sum of all 5 grades by 5 to get the average of them
		averageOf5 = totalOfGrades / 5;
		//return the value of averageOf5 to where the method was called
		return averageOf5;
	}//closes calculateAverage method
}//Closes Midterm_testGradeAndAverage class
