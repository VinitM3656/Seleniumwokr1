package Souyamadam;

public class Even_odd_Array {
   public static void main(String [] args) {
	    int a[] = { 1,2,3,4,5,6,7,8,9,10};
	    for( int i = 0; i<a.length;i++) {
	    	if( a[i]%2==0) {
	    		System.out.println(" some evene numbers are"+ ' '+a[i]);
	    	}		
	    	}
	    System.out.println(" now printing some odd values\n\n");
	    for( int i = 0; i<a.length;i++) {
	    	if( a[i]%2 !=0) {
	    		System.out.println(" some odd numbers are "+ ' '+a[i]);
	    	}
	    	    }
   }
}