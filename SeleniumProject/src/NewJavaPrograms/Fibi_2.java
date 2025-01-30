package NewJavaPrograms;

import java.util.Scanner;

public class Fibi_2 {
	public static void main(String [] args) {
		int num,a=0,b=1,c;
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		for( int i =1; i<=num;i++){
			System.out.println(a+" ");
			c= a+b;
			a =b;
			b=c;
		}
	}
			
		
	
}
