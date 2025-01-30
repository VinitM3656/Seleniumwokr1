package InterviewQuestions;

public class GivenStringPalyndrom {
	public static void main(String [] args) {
		
		try {
			
			 String str = " 123";
			 String sbr = new StringBuffer(str).reverse().toString();
			 if( str.equals(sbr))
				 System.out.println(" yes palindrom");
			 else
				 System.out.println(" Not Palindrom");
			 
		}
		catch( Exception e) {
			
			System.out.println(e);
		}

	}
}
