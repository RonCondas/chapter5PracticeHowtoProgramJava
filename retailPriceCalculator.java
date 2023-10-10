import java.util.Scanner;

public class retailPriceCalculator {

	public static void main(String[] args) {
		
		//variables
		Scanner kb = new Scanner (System.in);
		
		double wholeSale = 0;
		
		double percent = 0;
		
		//output message
		
		System.out.println("Please enter the item whosale cost. "); wholeSale = kb.nextDouble();
		
		System.out.println("Please enter the markup percentage. ");
		
		//input
		
		percent = kb.nextDouble();
		
		//logic or calculation
		
		//Display
		
		System.out.printf("If an item's wholesale cost is %.2f and a markup percentage is %.2f%n percent, then the item's retail price is %.2f ", wholeSale, percent, calculateRetail(percent, wholeSale) );
		
		kb.close();
	}
	
	public static double calculateRetail(double percent, double wholeSale) {
		
		
		double percentDecimal = percent / 100;
		
		double factor = wholeSale * percentDecimal;
		
		double retailPrice = factor + wholeSale;
		
		
		
		
		return retailPrice ;

}
}