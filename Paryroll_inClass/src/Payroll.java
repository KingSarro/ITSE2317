public class Payroll {
	//---------1. Declaring field attributes (our variables)--------------//
		//-------------Global private variables (accessable within the class)---------//
	//Document told us to make a final of 7 for the employees
	public final int NUM_EMPLOYEES = 7;
	//The given employee ID's 
	private int[] employeeId = { 1234567, 5738472, 9347298, 4727287,
								 7287237, 3810193, 3838923};
	//Uses the final constant to set the size of all the relative arrays
	private int[] hours = new int [NUM_EMPLOYEES];
	private double[] payRate = new double[NUM_EMPLOYEES];
	private double[] wages = new double [NUM_EMPLOYEES];
	
//------------------------GET METHODS-----------------------//
	/*Tells the program to retrieves the saved employee id value */
	public int getEmployeeIdAt(int index) {
		//return the value of the array's sent index
		return employeeId[index];
	}//closes getEmployeeIdAt
	
	public int getHoursAt(int index) {
		//return the value of the array's sent index
		return hours[index];
	}
	
	public double getPayRateAt(int index) {
		//return the value of the array's sent index
		return payRate[index];
	}
	
	public double getWages(int index) {
		//return the value of the array's sent index
		return wages[index];
	}
	
//------------------------Set METHODS-----------------------//
	public void setEmplyeeIdAt(int index, int idNum){
		//Saves the current indexed employee id as the value of idNum
		employeeId[index] = idNum;
	}//closes setEmployeeAt method
	
	public void setHoursIdAt(int index, int h){
		//Saves the current indexed employee id as the value of idNum
		hours[index] = h;
	}//closes
	public void setPayRateAt(int index, double payrate){
		//Saves the current indexed employee id as the value of idNum
		payRate[index] = payrate;
	}//closes
	public void setWagesAt(int index, double w){
		//Saves the current indexed employee id as the value of idNum
		wages[index] = w;
	}//closes
	
	
	
	public double calcGrossPay(int index) {
		return hours[index] * payRate[index];
	}
	
	
	
}//Closes constructor class Payroll
