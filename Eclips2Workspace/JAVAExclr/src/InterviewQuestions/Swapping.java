package InterviewQuestions;

import java.util.Arrays;

public class Swapping {
	
	public static void main(String [] args) {
		int a [] = {1,2,3,4,5};
		int b[] = { 6,7,8,9};
		int c[] = a;
		a=b;
		b=c;
		System.out.println(Arrays.toString(a));
		System.out.print(Arrays.toString(b));
		
	}

}
