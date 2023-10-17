//Sharri'a Sneed
//Oct 17, 2023
//ITSE 2317

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		double inputNums[] = new double[10];
		double maxNum = 0;
		double minNum = 0;
		
		for (int i = 0; i < inputNums.length; i++) {
			System.out.println("Type in number " + (i+1) + ":");
			System.out.print(">> ");
			inputNums[i] = userInput.nextDouble();
			System.out.println();
		}//closes for
		
		maxNum = getMax(inputNums);
		minNum = getMin(inputNums);
		display(maxNum, minNum);

	}//closes main
	
	private static double getMin(double array[]) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}//close if
		}//close for
		return min;
	}//closes getMin
	
	private static double getMax(double array[]) {
		double max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}//close if
		}//close for
		return max;
	}//closes getMax

	private static void display(double max, double min) {
		System.out.println("Your maximum value inputed was : " + max);
		System.out.println("Your minimum value inputed was : " + min);
	}
}
