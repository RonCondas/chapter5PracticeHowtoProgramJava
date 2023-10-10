package chp5PaintCompany;

import java.io.InputStream;
import java.util.Scanner;

public class paintCompany {

	public static void main(String[] args) {
		
		
		
		//variable
			
				
		
				store();
				
				int numbRooms = numRooms();				
				
				store1();
				
				double gallon =gallonPrice();
				
				//talk to user
				
				
				//store
				double squarefoot = loop(numbRooms);
				
				//calculation or logic
				
				int newPaint = paintRequired(squarefoot); // calculate the total of paint require
				
				double newHours = hoursOfLabor(newPaint); // The total of hours require to paint all the rooms
				
				double newCost = costOfPaint(gallon, newPaint); // The price of all the gallon of paint combine
				
				double newlabor = laborCharges(newHours); // amount of money per hour the company will charge
				
				//display
				
				output(newPaint, newHours, newCost, newlabor);
	  		
			} public static double loop(int numbRooms) {
				
				Scanner kb = new Scanner (System.in);
				
				int counter =1;
				
				int totalSquareFoot =0;
				
				while (counter <= numbRooms)
				{
					
					
					System.out.printf("What is the square footage of wall space in room: " + counter );
					int squareFootage = kb.nextInt();
					totalSquareFoot = totalSquareFoot + squareFootage;
					counter++;
				}
				return totalSquareFoot;
			
			}
			
				
			
				
				public static void store() {
					
					System.out.println("Please enter the number of room to be painted: ");
					
			
			}
				public static void store1() {
					
					System.out.println("What is the price of your favorite gallon of paint: ");
					
			
			} 
				public static double gallonPrice() {
					
					Scanner kb = new Scanner (System.in);
					
					
					double PriceGallon = kb.nextDouble();
					
					
					return PriceGallon;
					
			}public static int numRooms() {
						
						Scanner kb = new Scanner (System.in);
						
						
						int numbrooms = kb.nextInt();
						
						
						return numbrooms;
						
					
				
			
			} 
				public static int paintRequired(double squarefoot){
				int painted = (int) (squarefoot/100);
				
				return painted;
				
			} public static double hoursOfLabor(int newPaint) {
				
				double hours = newPaint*8.00;
				return hours;
				
			}public static double costOfPaint(double gallon , int newPaint) {
				
					double cost = gallon * newPaint;
					
					
					return cost;
			
			


			}public static double laborCharges(double newHours) {
				
				double labor = newHours * 20;
				
				return labor;
				
					
			}public static double totalCost(double newCost, double newlabor) {
				
				double total = newCost + newlabor;
				
				
				return total;
			
			
				
				
				
			
			
			} 
			public static void output(int newPaint, double newHours, double newCost, double newlabor ) {
				
				System.out.printf("Number of Gallons required: %d%s%n", newPaint, "gallons");	
				
				System.out.printf("%nHours of Labor: %.2f %s", Math.ceil(newHours),"hours" );	
				
				System.out.printf("%nCost of paint: $%.2f" , Math.ceil(newCost));
				
				System.out.printf("%nLabor Charges: $%.2f" , Math.ceil(newlabor));
				
				System.out.printf("%nTotal for the Paint Job: $%.2f" , Math.ceil(totalCost(newCost, newlabor)));
				
			}

}											
			
			