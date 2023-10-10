import java.util.Arrays;
import java.util.Scanner;

public class rainFall {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//variables
		
		double [] rain = new double[12];
		
		//talk to user
		
		System.out.println("Please enter the total of rain fall for each of the 12 months");
		
		//logic and calculations
		
		for(int i = 0; i<=11;  i++) 
		
		{
			
			
			
			System.out.printf("%nPlease enter the %d month",i);
			
			rain[i] = kb.nextDouble();
			
			
			
		}
		
//		for(int i = 0; i<=11;  i++) {
//			
//			System.out.print(rain[i] + " \n");
//		}
		
		double totals = total(rain);
		
		double average = ave(totals, rain);
		
		double large = largest(rain);
		
		double leastest = least(rain);
		
		//Display
		
		display(totals,average,large, leastest);
		
		
	}
		public static double total(double rain[]) {
			
			double daTotal = 0;
		
			for (int i = 0; i<=11; i++) {
			
				daTotal = daTotal + rain[i];
				
			}
				
			return daTotal;
			
		}
			
			public static double ave(double totals, double rain[]) {
				
				double average = totals / rain.length;
				
				return average;
				
	}	public static double largest(double rain[]) {
		
		double bigest = 0;
		
		for(int i = 1; i <= rain.length; i++)
			
			
		{
			
			if(bigest > rain[i]) 
				
				bigest = rain[i];
				
		}
			
		return bigest;
		
	}	public static double least(double rain[]) {
		
		double least = 0;
		
		for(int i = 0; i <= rain.length; i++)
			
			
		{
			
			if(least < rain[i]) 
				
				least = rain[i];
				
		}
			
		return least;
		
		

}
	public static void display(double totals,double average, double large, double leastest) {
		
		System.out.printf("The total rain fall for the year is:\t", totals);
		
		System.out.printf("The average of rain fall of all the years conbine is:\t", average);
		
		System.out.printf("The month with the most rain was:\t", large);
		
		System.out.printf("The month with the least rain was ", leastest);
		
	}

}