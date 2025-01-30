package java1404;

import java.util.Arrays;

public class swapping {
	public static void main(String [] args) {
		int a [] = {1,2,3,4,5,6};
		int b [] = {4,5,6,7,8};
		int c [] = a;
		a=b;
		b=c;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
