import java.util.Scanner;

public class showChar {

	public static void main(String[] args) {
		
		// variable
		
		int numb = 0;
		
		String myStr = " ";
		
		Scanner kb = new Scanner (System.in);
		
		
		
		
		
		//talk to user 
		//store
		System.out.println("Please enter the string argument"); myStr = kb.nextLine();
		
		System.out.println("Please enter the number argument"); numb = kb.nextInt();
		
		
		
		
		//calculation logic
		
		System.out.printf("In this call the method will display the character %s because it is in position %d ", showchar(myStr, numb), numb);
		
		//display
		
		kb.close();
		
		} public static char showchar(String myStr, int numb) {
		
		char result = myStr.charAt(numb);
		
		return result;	}

}
