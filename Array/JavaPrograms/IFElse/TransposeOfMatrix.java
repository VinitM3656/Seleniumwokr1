package JavaPrograms.IFElse;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String args[])
	{
		int m,n,c,d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the rows and coloum");
		m= in.nextInt();
		n= in.nextInt();
		
		int matrix[][]= new int [m][n];
		
		System.out.println("Enter the element matrix");
		
		for(c= 0;c < m ; c++)
			for(d = 0 ; d< n ; d++)
				matrix[c][d] = in.nextInt();
		int transport[][] = new int[n][m];
		for(c = 0; c<m; c++)
		{
			for(d = 0 ; d<n ; d++)
				transport[d][c] = matrix[c][d];
		}
		
	}

}
