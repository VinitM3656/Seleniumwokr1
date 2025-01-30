package java1404;

import java.util.Arrays;

public class SecondLargestArray {
	
	public static void main(String [] args) {
		
		int a [] = { 1,5,6,7,8,9,23};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	
		
		int secondLarger=a[a.length-2];
		System.out.println(secondLarger);
		
		int thirdLargest= a[a.length-3];
		System.out.println(thirdLargest);
		
		
		// for small element
		
		int small=a[0];
		System.out.println(small);
		
		
		// largest array
		int largest= a[a.length-1];
		System.out.println(largest);
		
		
	}

}
