package May01.SDETQ;

public class ArraysandString {
	public static void main(String [] args) {
		int a [] = {10,20,30,40,50,60,70};
		int n = a.length;
		System.out.println("Odd numbers");
		for( int i = 0; i<a.length;i++) {
			if(a[i]%2 != 0) {
				System.out.println(a[i]+" ");
				
			}
		}
		System.out.println();
		
	}
	

}
