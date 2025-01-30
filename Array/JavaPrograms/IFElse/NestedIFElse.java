package JavaPrograms.IFElse;

import java.util.Scanner;

public class NestedIFElse {
	public static void main(String [] args) {
		
		int marksObtained, passingMarks;
		char grade;
		
		passingMarks = 50;
		Scanner input = new Scanner(System.in);
		System.out.println("Input marks scored by you");
		marksObtained = input.nextInt();
		int marksObatined = 0;
		if(marksObatined >= passingMarks){
			if(marksObtained>90)
				
				grade='A';
			
		}
	}

}
