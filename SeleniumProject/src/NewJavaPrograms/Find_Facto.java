package NewJavaPrograms;

import java.util.Scanner;

public class Find_Facto {
	
	public static void main(String [] args) {
		
		int no ,fect=1;
		{
		Scanner s = new Scanner(System.in);
		System.out.println(" enter the number");
		no=s.nextInt();
		for( int i =1; i<=no;i++)
		{
			
			fect= fect*i;
			
		}
		System.out.println(" factoria is :"+ fect);
}

		
	}
}