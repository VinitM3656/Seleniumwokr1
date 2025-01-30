package java1404;

import static org.testng.Assert.assertThrows;

public class Exception {
	
	public static void main(String [] args) {
		int a = 10;
		 int b = 2;
		 try {
			 
			 if(b==0) {
				 throw new ArithmeticException(" why are you dividing with 0");
				 
			 
			 }
			 System.out.println(a/b);
			 
		 }
		 catch(NullPointerException e1) {
			 System.out.println(e1.getLocalizedMessage());
			 
		 }
		 finally {
			 System.out.println(" finally excecuted");
			 
		 }
		 System.out.println(" normal line");
		 
	}

}
