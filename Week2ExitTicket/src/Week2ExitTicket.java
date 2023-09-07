import java.io.*;
import java.util.Scanner;
/*
Name: Sharri'a Sneed
Date: 9/7/2023
Course: ITSe 2317
Description: Get the user to input the length of width of two different rectangles.
			 The program then tells the user which rectangle has the greatest perimeter.
*/
public class Week2ExitTicket {

	public static void main(String[] args) {
		//Initialize variables used in the program
		Scanner userInput = new Scanner(System.in);
		double len1 = 0;
		double len2 = 0;
		double wid1 = 0;
		double wid2 = 0;
		double perimeter1 = 0;
		double perimeter2 = 0;
		
		//Prompts the User to input the length and width of the first rectangle.
		//Saves the values to their respectable variables
		System.out.print("Please enter the length of the first rectangle: \n>> ");
		len1 = userInput.nextDouble();
		System.out.print("Please enter the width of the first rectangle: \n>> ");
		wid1 = userInput.nextDouble();
		//Prompts the User to input the length and width of the second rectangle.
		//Saves the values to their respectable variables
		System.out.print("Please enter the length of the second rectangle: \n>> ");
		len2 = userInput.nextDouble();
		System.out.print("Please enter the width of the second rectangle: \n>> ");
		wid2 = userInput.nextDouble();
		
		//Calculates the perimeter of the first rectangle
		perimeter1 = 2 * (len1 + wid1);
		//Calculates the perimeter of the first rectangle
		perimeter2 = 2 * (len2 + wid2);
		
		//Displays the perimeters of the two rectangles
		System.out.println();
		System.out.println("The perimeter of the first rectangle is: " + perimeter1);
		System.out.println("The perimeter of the second rectangle is: " + perimeter2);
		//Checks to find out which rectangle has the bigger perimeter
		if (perimeter1 > perimeter2) {
			System.out.println("The first rectangle has a grater perimeter than the second rectangle");
		}//Closes 1st if statement
		else if (perimeter1 < perimeter2) {
			System.out.println("The second rectangle has a grater perimeter than the first rectangle");
		}
		else {
			System.out.println("The first and second rectangle have the same perimeter");
		}
		
		//Closes the scanner object
		userInput.close();
		
	}//closes main method

}//closes Week2ExitTicket class
