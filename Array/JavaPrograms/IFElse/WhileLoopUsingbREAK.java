package JavaPrograms.IFElse;

import java.util.Scanner;

public class WhileLoopUsingbREAK {
	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);
				while (true) {
					System.out.println("Input an integer");
					n= input.nextInt();
					if(n !=0) {
						
						System.out.println("You enterd"+n);
						continue;
					}
					else {
						break;
					
					}
				}
	}

}
