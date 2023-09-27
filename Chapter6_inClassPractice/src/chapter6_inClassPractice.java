import java.util.Arrays; //makes arrays more powerful


public class chapter6_inClassPractice {

	public static void main(String[] args) {
		//First way of Initializing arrays
		int[] nums = new int[10];//created with 10 0's //default [d:] 0
		for (int i=0; i <nums.length; i++){//length is how long the array is
			System.out.println(nums[i]);
			//think of this being babies born as 0's
		}//Initialize this way if you don't know what will be in the array
		//Second way of Initializing arrays
		double[] saleries = {4.5, 6.6, 2.3,1.2}; //d: 0.0
		for (int i=0; i <saleries.length; i++){
			System.out.println(saleries[i]);
			//think of this being babies born as 0's
		}
		
		//Take away: Can either set its size and have it start with 0's
					//or Start with all the elements values and set the size by
		
		final int ARRAY_SIZE = 10; //Make this constant so you can change all code quickly
									//in case you have to change values
				//Constants are typically ALL CAPs for easy reading for users
		
		char[] mInitial = new char[ARRAY_SIZE]; //d: (blank space)
		boolean[] payCuts = new boolean[ARRAY_SIZE]; //d: false
		String[] name = new String[ARRAY_SIZE]; //d: null
		
		//---------------------------------------------------------------------------------------
		
		int[] numbers = {2, 6, 10, 30, 12, 26, 27};
		double sum = 0;
		double average = 0;
		
		for (int i=0; i <numbers.length; i++){
			System.out.println(numbers[i]);
			sum = sum+numbers[i];
		}
		average = sum / numbers.length;
		
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + average);
		
		//-------------------------------------------------------------------------
		
		//2-Dimentional arrays
		int nums2d_2r5c [][] = {
				{1,3,5,7,9},
				{2,4,6,8,10}		
		};//closes 2d array
		
		for (int i=0; i <nums2d_2r5c.length; i++){ //see this as your x //prints rows
			for (int j=0; j <nums2d_2r5c.length; j++){ //see this as your y //prints columns
				System.out.println(nums2d_2r5c[i][j]);
			}
		}
		
		//this is also still considered a 2-Dimentional array
		int nums2d_3r5c [][] = {
				{1,3,5,7,9}, //numbers 1,3,5,7,9 make up a column
				{2,4,6,8,10},
				{3,6,9,12,15} //numbers 1,2,3 make up a row
				
		};//closes 2d array
		
		for (int i=0; i <nums2d_3r5c.length; i++){ //see this as your x //prints rows
			for (int j=0; j <nums2d_3r5c.length; j++){ //see this as your y //prints columns
				System.out.println(" " + i + " " + j + " " + nums2d_3r5c[i][j]);
			}
		}
		
		//------------------------------------------------------------------------------------
		//imported Arrays class
		
		
		for (int i=0; i <saleries.length; i++){
			System.out.println("Saleries unsorted: " + saleries[i]);
			//think of this being babies born as 0's
		}
		Arrays.sort(saleries);//this overrides you original array, of they will forever be in that order
		for (int i=0; i <saleries.length; i++){
			System.out.println("Saleries sorted: " + saleries[i]);
			//think of this being babies born as 0's
		}
		
		Arrays.binarySearch(saleries, 4.5);//Sends back the index of the value
											//Must be sorted first before being used (says in the manual)
		System.out.println(Arrays.binarySearch(saleries, 4.5));
		
	}

}
