package May01;

import CodingSekho2.String;

public class EvenAndodd {
	public static void main(String [] args) {
		 int a[] = { 1,2,3,4,5,6,7};
		 
		 for(int i = 0 ; i<a.length;i++) {
			 
			 if(a[i]%2==0) {
				 System.out.println(a[i]);
				 
			 }
		 }
	
		 for( int i = 0 ;i<a.length;i++) {
			 if(a[i]%2!=0) {
				 System.out.println(a[i]);
				 
			 }
				 
			 }
		 }
		 
}
