package NewJavaPrograms;

import java.util.Scanner;

public class Fibonacci_Series {
	

public static void main(String [] args) {
	int i, no ,first=0,second=1,next;
	Scanner s = new Scanner(System.in);
	System.out.println(" enetr the number");
	no=s.nextInt();
	first = 0;
	second = 1;
	System.out.println("Fiboncci series is");
	for(i=0;i<=no;i++) {
		System.out.println(first);
		next= first+ second;
		second=next;
	}
	
}
	
}
