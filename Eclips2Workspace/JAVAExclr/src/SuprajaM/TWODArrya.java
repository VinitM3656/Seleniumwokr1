package SuprajaM;

public class TWODArrya {
	public static void main(String []args)
	{
		int a[][]=new int[2][];
		 a[0]=new int[3];
		 a[1]=new int[5];
		
		a[0][2]=22;
		a[1][3]=44;
		System.out.println(a[0][2]);
		System.out.println(a[1][3]);
		
		
	}
}