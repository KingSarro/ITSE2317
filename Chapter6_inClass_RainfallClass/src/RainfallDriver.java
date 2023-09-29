
public class RainfallDriver {
	
	//1.Variables
	double[] rain;	//Array to hold rainfall data
	
	public RainfallDriver(double[] thisYear) {//Constructor with an array parameter
		
		//Created a new array named rain the size of the one given by the demo
		rain = new double[thisYear.length];
		
		//Copy each element of the array thisYear into my new array named rain 
			//make a copy so we don't mess with the original
		for (int i = 0; i < thisYear.length; i++) {
			rain[i] = thisYear[i];
		}	
	}
	
	public double getTotalRainfall() {
		return 0.0;
	}
	public double getHighestMonth() {
		return 0.0;
	}
	public double getLowestMonth() {
		return 0.0;
	}
	public double getRainAt(int e) {
		return 0.0;
	}
}
