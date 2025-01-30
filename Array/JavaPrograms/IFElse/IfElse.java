package JavaPrograms.IFElse;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		int marksObtained , passingMarks;
		
		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("Input marls scored by you");
		
		marksObtained =  input.nextInt();
		
		if(marksObtained>= passingMarks) {
			System.out.println("Ypu passed the exam.");
			
		}
		else {
			System.out.println("Unfortunely you failed to pass the exam.");
			
		}
	}

}
