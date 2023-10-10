import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		
		int primo;
		
		System.out.println("Enter a number to find out if is prime or not!!!"); primo = kb.nextInt();
		
		
		System.out.printf("It's %s that number is prime", isPrime(primo)); 
	
	
	}public static boolean isPrime (int primo) {
		
		int i=3;
		
		int o=5;
		
		int u = 2;
		
		if(primo%i == 0 || primo%o == 0 || primo%u == 0)
			return true;
		
		else 
			return false;
		
		}
		
		
	

}
