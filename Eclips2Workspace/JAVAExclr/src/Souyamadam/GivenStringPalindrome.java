package Souyamadam;

public class GivenStringPalindrome {
	public static void main(String [] args) {
		
		try {
			
			String str = " 121";
			String sbr = new StringBuffer(str).reverse().toString();
			if( str.equals(sbr))
				
				System.out.println(" gievn string is palindrome");
			
		 else 
			System.out.println(" given string is not palindrome");
		
	} catch(Exception e) {
		System.out.println(e);
	}
	}


}