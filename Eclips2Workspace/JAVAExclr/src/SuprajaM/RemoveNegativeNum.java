package SuprajaM;

import java.util.Arrays;

public class RemoveNegativeNum {
	public static void main(String [] args) {
		
		int arrlist1[]= { 1,2,3,4,5,-2,4,-4};
		
		int arrlist2[]= new int[8];
		
		for( int i = 0;i<arrlist1.length;i++) {
			if(arrlist1[i]>=0) {
				System.out.println(arrlist1[i]);
				arrlist2[i]=arrlist1[i];
				
			}
		}
		System.out.println(Arrays.toString(arrlist2));
		
	}

}
