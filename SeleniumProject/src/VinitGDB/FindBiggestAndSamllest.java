package VinitGDB;

public class FindBiggestAndSamllest {
	public static void main(String[] args) {
		int [] a = { 23,24,45,67,87,65};
		
		int big = a[0];
		int small= a[0];
		for(int i : a) {
			if(i > big) {
				big = i;
				
			}
			else if(i < small) {
				small = i;
				
			}
			
			System.out.println("Biggest : "+big);
			System.out.println("Smallest : "+small);
		}
	}

}
