
public class RainfallDemo {
	public static void main(String args[]) {
		double[] thisYear = {
				1.4, 2.3, 3.6, 7.8,
				5.6, 7.8, 7.8, 2.5,
				4.9, 9.3, 3.6, 6.8};
	}
	
	RainfallDriver r = new RainfallDriver(thisYear);//Creating an object of rain Driver and sending it an array
	
	System.out.println(r.getTotalRainfall());

}
