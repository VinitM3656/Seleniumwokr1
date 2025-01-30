package InterviewQuestions;

import java.util.Scanner;

public class Palindrome_No {
	public static void main(String [] args) {
		
		int a , no,b,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		no=s.nextInt();
		b=no;
		while(no>0) {
			a=no%10;
			no=no/10;
			temp=temp*10+a;
		}
		
		if(temp ==b)
		{
			System.out.println("palindrome");
			
		}
		else
		{
			System.out.println("not palindrome");
			
			
		}
	}

}
