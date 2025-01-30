package InterviewQuestions;

import java.util.Scanner;

//is in the form of 0, 1, +1,+ 2,+ 3,+ 5,+ 8,+ 13,+ 21,

public class Fibonacci_Series {
	public static void main(String [] args) {
		int i,no,first=0,second=1,next;
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the number of terms for Serie:");
		no=sc.nextInt();
		first = 0;
		second = 1;
		System.out.println("fibo series ARE");
		
		for(i= 0;i<no; i++) {
			System.out.println(first);
			next= first + second;
			first = second;
			second =next;
		}
		}
	}


