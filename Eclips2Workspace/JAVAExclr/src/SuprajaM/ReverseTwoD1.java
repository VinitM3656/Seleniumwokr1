package SuprajaM;

public class ReverseTwoD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{ 1,2,3,4},{5,6,7,8,9}};
		for( int i = a.length-1;i>=0;i--) {
			for(int j = a[i].length-1;j>=0;j--) {
				System.out.println(a[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}
