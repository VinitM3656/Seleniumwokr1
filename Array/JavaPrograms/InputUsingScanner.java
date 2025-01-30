package JavaPrograms;

import java.util.Scanner;

public class InputUsingScanner {
	public static void main(String[] args) {
		int a;
		float b;
		String s;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		s= in.nextLine();
		System.out.println("You enterd the string "+s);
		
		
		
		System.out.println("Enter the integer");
		a= in.nextInt();
		System.out.println("You enter integer"+a);
		
		
		
		System.out.println("Enter  a float");
		b=in.nextFloat();
		System.out.println("You enterd float "+b);
		
	}

}
