package _43567Practice99;

import java.util.Arrays;

public class Swapping { 
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6};
		int b[] = {4, 5, 6, 7, 8};
		
		System.out.println("Before swapping:");
		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));
		
		swapArrays(a, b);
		
		System.out.println("After swapping:");
		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));
	}
	
	private static void swapArrays(int[] a, int[] b) {
		int[] temp = a;
		a = b;
		b = temp;
		// The above lines only swap the references; they do not change the original arrays.
		// You need to update the arrays in the calling method.
	}
}
