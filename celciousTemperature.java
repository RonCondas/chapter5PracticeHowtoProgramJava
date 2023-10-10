
public class celciousTemperature {

	public static void main(String[] args) {
		
		//variable
		
		int F = 32; // Celsius
		
		int counter = 0;
		
		//talk to user
		//store
		
		System.out.println("Comvertion of 0 to 20 from Faranheit to celcius");
		
		System.out.printf("%s%20s%n" ,"Celsius","Fahrenheit" );
		
		//calculation or logic
		
		while (counter <= 20) {
			
			System.out.println(counter+ "\t\t\t\t"+Celsius(counter));
			
			counter++;
			
		}
		
		//display

	} public static double Celsius(double  F) {
		
		double C = (F - 32.0) * (5.0/9.0);
		
		return C;
	}

}
