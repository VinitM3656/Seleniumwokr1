package May01;

public class TwoDtoOne {
	public static void main(String [] args) {
		
		int a [] [] = {{ 1,2,3,4,5},{4,5,6}};
		int c [] = new int [5];
		for( int i = 0; i<a.length;i++) {
			for( int j = 0; i<a[i].length;j++) {
				c[i]=a[i][j];
				System.out.println(c[i]+" ");
				
			}
		
		}
	}

}
