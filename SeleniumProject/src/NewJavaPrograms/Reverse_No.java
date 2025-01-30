package NewJavaPrograms;

//package NewJavaPrograms;

import java.util.Scanner;

public class Reverse_No {
	
public static void main(String [] args) {
	int no 
	
	, rev= 0,r,a;
	Scanner s = new Scanner(System.in);
	System.out.println(" enter the given number");
	no= s.nextInt();
a= no;

while(no>a) {
	r= no%10;
	rev= rev*10+r;
	no=no/10;
	
}
	System.out.println(" reverse+"+rev);
}
	
}/*
Initially, no is assigned the value of 123 and a is assigned the same value (123).
In the while loop, the loop continues until no becomes 0.
In each iteration of the loop:
r is assigned the remainder of no divided by 10, which extracts the last digit of no. For 123, r becomes 3 in the first iteration.
rev is multiplied by 10 and then r is added to it. This effectively appends the extracted digit to the rev. For the first iteration, rev becomes 3.
no is divided by 10 to remove the last digit. For the first iteration, no becomes 12.
The loop continues until no becomes 0. In each iteration, the last digit of no is added to rev in reverse order.
Finally, the rev variable holds the reversed number, which is then printed out.*/