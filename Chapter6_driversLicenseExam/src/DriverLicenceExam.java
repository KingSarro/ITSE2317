import java.util.Scanner;

/*
 * Sharri'a Sneed
 * ITSE 2317
 * 9-28-23
 * Desc: Make a program to check the 20 answers for a drivers test
 * */



public class DriverLicenceExam {
	public static void main(String args[]) {
		getAnswers();
	}//closes main method
	
	/* [Displays the calculated data to the user through the console] */
	static void displayResults(boolean hasPassed, int totalCorrect, int totalIncorrect, int[] missedQuestions){
		//Displays the calculated results of the program to the user
		System.out.println("\n----------------------------------------------------");
		System.out.println();
		System.out.print("You " + (hasPassed == true? "passed ": "failed ") + "with a " + totalCorrect + "/" + (totalCorrect+totalIncorrect) + ".");
		System.out.println();
		
		//Checks if the user missed a question
		if (totalCorrect != 20) {//1st if statement
			//Tells the user that the questions they got wrong will be displayed
			System.out.print("The questions you got wrong are question(s): ");
			//Runs through the missed questions array to get the questions missed
			for (int i = 0; i < missedQuestions.length; i++) {//1st for loop
				if (missedQuestions[i] != 0) {//2nd if statement
					//Displays the number of the missed question
					System.out.print( "[" + missedQuestions[i]  + "] ");
				}//closes 2nd if statement
			}//1st for loop
		}//closes 1st if statement
	}//closes displayResults methods
	
	/* [Gets the user to input 20 variables (which represent answers) to be calculated (to see if they are correct)] */
	static void getAnswers() {
		//Created a Scanner object to take the user's input
		Scanner userInput = new Scanner(System.in);
		//Initializes an array to hold the user inputed answers
		String[] userAnswers = new String[20];
		//Initialized a variable to be used to save the user's input
		String inputedAns = "empty";
		
		//loops 20 times to get 20 user inputed answers
		for (int i = 0; i < userAnswers.length; i++) {//1st for-loop
			//prompts the user to enter an answer from an exam
			System.out.print("Please enter the answer of question " + (i+1) + ".\n>> ");
			//Checks if the user did not type a valid answer typed a valid answer
				//first while loop
			while ( !inputedAns.equals("a") && !inputedAns.equals("b") && !inputedAns.equals("c") && !inputedAns.equals("d") ) {
				//Gets the user's input and saves it to the variable inputedAns
				inputedAns = userInput.nextLine();
				//Checks if the user has not entered valid answer choices...
					//Give the user an error message and tells them valid inputs
					//first if statement
				//saves the lowercase value of what inputedAns is
				inputedAns = inputedAns.toLowerCase();
				//Checks if the inputed value is a valid answer
				if ( inputedAns.equals("a") || inputedAns.equals("b") || inputedAns.equals("c") || inputedAns.equals("d") ) {
					//sets the current index of userAnswers to the value of inputedAns
					userAnswers[i] = inputedAns;
				}//closes if statement
				else {//1st else statement
					//Displays a message listing valid inputs
					System.out.println();
					System.out.print("Please enter one of the four options: A, B, C, or D \n>> ");
				}//closes 1st else statement
				System.out.println("");
			}//closes 1st while loop	
			inputedAns = "empty";
		}//closes 1st for-loop
		//Closes the Scanner object
		userInput.close();
		//Calls the checkAnswers method
		checkAnswers(userAnswers);
	}//closes getAnswers
	
	/* [Compares the correct answers to the user's answers and sees if they are the same] */
	static void checkAnswers(String[] userAnswers) {
		//Created a final variable to be used as the correct answers
		final String[] correctAnswers = {"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
		//Initialized variables to hold calculated information 
		boolean userPassed = false;//did the user pass
		int cAnswers = 0;//correct Answers
		int inAnswers = 0;//Incorrect Answers
		int[] missedQ = new int[correctAnswers.length];//All of the questions that were wrong
		//Loops 20 times to compare the values of both array's current indexes
		for (int i = 0; i < correctAnswers.length; i++) {//1st for-loop
			//Checks if the current index of both arrays have the same value
			//System.out.println("Index 0: " + correctAnswers[i].toLowerCase());
			if (userAnswers[i].equals(correctAnswers[i].toLowerCase())) {//1st if statement
				//Adds 1 to the variable containing the count of correct answers
				cAnswers++;
			}//closes if statement
			else{//1st else statement
				//Adds 1 to the variable containing the count of incorrect answers
				inAnswers ++;
				//Adds 1 to the variable array containing the count of missed questions
				missedQ[i] = i;
			}//closes 1st else statement
		}//closes for loop
		
		//Checks if the user passed
		if (cAnswers >= 15) {//2nd if statement
			//sets that the user passed to true
			userPassed = true;
		}//closes 2nd if statement
		//Calls the displayResults method
		displayResults(userPassed, cAnswers, inAnswers, missedQ);
	}//closes checkAnswers method
}//closes Chapter6_driversLicenseExam class
