//Sharri'a Sneed
//Oct 17, 2023
//ITSE 2317

import java.util.Scanner;


public class PrimeDemo {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		int num = 0;
		System.out.println("Enter a whole number greater than 0: ");
		System.out.print(">> ");
		num = userInput.nextInt();
		System.out.println();
		
		System.out.println(num + " is a prime number: " + isPrime(num) + ".");
	}
	
	private static boolean isPrime(int num) {
		boolean notPrime = false;
		for (int i = 1; i < num; i++) {
			if (num % i == 0 && i != 1 && i != num) {
				notPrime = true;
			}//closes if
		}//closes for
		
		return !notPrime;
	}//close isPrime
	
	
}
