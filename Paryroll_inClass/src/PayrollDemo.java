import java.util.Scanner;

public class PayrollDemo {
	public static void main(String args[]){
		Payroll pr = new Payroll();
		//int employee
		int hours;
		double payRate;
		Scanner userInput = new Scanner(System.in);
		
		
		
		for (int i = 0; i < pr.NUM_EMPLOYEES; i++) {//1st for-loop
			//Ask for hours of i employee
			System.out.print("Enter the hours worked by the employee number " + pr.getEmployeeIdAt(i) + ": ");
			hours = userInput.nextInt();
			
			while (hours < 0) {
				//Ask for a valid input of hours
				System.out.print("Error! Enter a whole number of 0 or higher for employee" + pr.getEmployeeIdAt(i) + ": ");
				hours = userInput.nextInt();
			}//closes 1st while-loop
			pr.setHoursIdAt(i, hours);
			
			
			//Ask for pay-rate of i employee
			System.out.print("Enter the hourly pay of employee number " + pr.getEmployeeIdAt(i) + ": ");
			payRate = userInput.nextInt();
			
			while (payRate < 6.0) {
				//Ask for a valid input of pay rate
				System.out.print("Error! Enter a number of 6.00 or higher for employee " + pr.getEmployeeIdAt(i) + ": ");
				payRate = userInput.nextDouble();
			}//closes 1st while-loop
			pr.setPayRateAt(i, payRate);
		}//closes 1st for-loop
		
		
		for (int i = 0; i < pr.NUM_EMPLOYEES; i++) {
			System.out.println("---Payroll Data---");
			System.out.println("Employee ID: " + pr.getEmployeeIdAt(i));
			System.out.println("Hours: " + pr.getHoursAt(i));
			System.out.println("Payrate: " + pr.getPayRateAt(i));
			System.out.println("Gross Pay: " + pr.calcGrossPay(i));
		}
		
		userInput.close();
	}//closes main method
}
