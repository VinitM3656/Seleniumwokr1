package JAVAEXCLER;

public class Reverse34 {
           public static void main(String [] args) {
	           
        	  /* String Orignal=" hello bithc";
        	   String Reverse= " ";
        	   
        	   System.out.println(Orignal);
        	   
        	   for( int i = 0; i< Orignal.length();i++);{
        		   
        		   Reverse= Orignal.charAt(i) + Reverse;
        	   }
        	   System.out.println( " reverse"+ Reverse);
        	   
        	   }
        		   
        	   }**/
	
	
        	   String originalStr = "Hello";
        	   String reversedStr = "";

        	   for (int i = 0; i < originalStr.length(); i++) {
        	     reversedStr = originalStr.charAt(i) + reversedStr;
        	   }

        	   System.out.println("Reversed string: "+ reversedStr);
        	   
        	   
           }
}
