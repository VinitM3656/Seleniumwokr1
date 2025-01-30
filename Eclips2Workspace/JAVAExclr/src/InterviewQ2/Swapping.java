package InterviewQ2;

import java.util.Arrays;

public class Swapping {
	public static void main(String [] args) {
		int a [] = {1,2,3,4,5,6};
		int b[]= {5,6,7,8,9};
		int c []= a;
		
		a= b;
		b=c;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
