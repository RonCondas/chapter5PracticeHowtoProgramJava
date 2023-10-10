import java.util.Scanner;

public class AverageAndGrade {

	public static void main(String[] args) {
		
Scanner kb = new Scanner(System.in);
		
		//variable
		
		int score1 = 0;
		
		int score2 = 0;
		
		int score3 = 0;
		
		int score4 = 0;
		
		int score5 = 0;
		
		
		
		System.out.println("Please enter 5 number separated by spaces like in example (1 2 3 4 5 )"); score1 = kb.nextInt(); score2 = kb.nextInt(); score3 = kb.nextInt(); score4 = kb.nextInt(); score5 = kb.nextInt();
		
		System.out.printf("Your average is %d", calcAverage(score4, score5, score3, score2, score1) );
		
//		System.out.printf("Your lettergrade for grade 1 is %d", determineGrade(score1));
		
		
	} public static int calcAverage (int score1, int score2, int score3, int score4, int score5 ) {
		
		int add = score1 + score2 + score3 + score4 + score5;
		
		int average = add / 5;
		
		
		return average;
	
	} 
//	public static char determineGrade(int score1) {
//		
//		
//		
//		if (score1>=90) {System.out.println("A");
//			}else if (score1>=80) {System.out.println("B");
//			
//			}else if (score1>=70) {System.out.println("C");
//			
//			}else if (score1>=60) {System.out.println("D");
//		
//			} else {System.out.println("F");}
//			
//		
//		
//		return newscore;
			
			
	}
		
//	} public static int determineGrade(int score2) {
//		
//		if (score2<=90) {System.out.println("A");
//			}else if (score1<=80) {System.out.println("B");
//			
//			}else if (score1<=70) {System.out.println("C");
//			
//			}else if (score1<=60) {System.out.println("D");
//		
//			} else {System.out.println("F");}
//			
//			
//			
//			return score2;
		
		
		


