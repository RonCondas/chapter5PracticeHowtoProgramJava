import java.util.Scanner;

public class theDistance {

	public static void main(String[] args) {
		
		
		
		//variables
		int time = 0;
		
		final double gravity = 9.8;
		
		final double exponent = 2;
		
		final double halve = 0.5;
		
		Scanner kb = new Scanner(System.in);
		
		
		
		//output
		//store
		System.out.printf("Please enter the time period that the object took to touch the ground: "); time = kb.nextInt();
		
		System.out.printf("%s%20s%n", "times", "distances");
		
		//calculation and logic
		while( time <= 10) {
			
			System.out.printf("%5d%,20.1f%n", time, fallingDistance(gravity, exponent, halve, time));
			
			time++;
			
		}
		
		
		
		//display
		
	
		}public static double fallingDistance(double gravity, double exponent, double halve, int time ) {
			
			
			double distance = halve * gravity * Math.pow(time, exponent);
		
		
			return distance;
		
		
	}

}
