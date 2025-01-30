package InterviewQuestions;

import java.util.Scanner;

public class PrimeNumberOrNot {
	public static void main(String [] args) {
		int n , count= 0;
		
		System.out.println(" Enter the number");
		Scanner r= new Scanner(System.in);
	n=ref.nextInt();
		for( int i =1 ; i<=n; i++) {
			if( n %1==0) {
				count ++;
			}
			
		}
		if( count ==2)
			System.out.println(" prime number");
		
		
	}

}
