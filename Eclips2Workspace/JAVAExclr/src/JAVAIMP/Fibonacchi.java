package JAVAIMP;

public class Fibonacchi {
	public static void main(String [] args) {
	
		int n1 = 0;//we started from here
		int n2 = 1;
		int n3;
		int count = 10;// we are going till 10
		System.out.println(n1+" "+ n2);
		 for(int i = 0 ;i<=count;i++) {
			 n3 = n1+n2;
			 n1= n2;
			 n2=n3;
			 System.out.println(" "+n3);
		 }
	}
		 }