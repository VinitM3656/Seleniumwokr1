package java1404;

public class Even_Odd {
	public static void main(String [] args) {
		
		int a[] = { 1,2,4,5,6,7,8,9,0};
		
		for( int i = 0; i<= a.length;i++) {
			if(a[i]%2==0) {
				System.out.println( " it is even number baby"+ " "+ a[i]);
				
			}
		}
		
		for( int i = 0 ; i<a.length;i++) {
			if( a[i]%2!=0) {
				System.out.println(" its a odd number"+ " "+ a[i]);
				
			}
		}
	}

}
