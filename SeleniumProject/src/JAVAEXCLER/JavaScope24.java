package JAVAEXCLER;

public class JavaScope24 {
	public static void main(String [] args) {
		//int x = 200;
		//System.out.println( x);
		
		int result = sum(10);
	    System.out.println(result);
	  }
	  public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
	}