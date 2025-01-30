package JavaTpoint;

public class Palindrome {
	
		
	
	public static void main(String [] args) {
		try {
			
			
			String str = "120";
			String sbr= new StringBuffer(str).reverse().toString();
			
			if(str.equals(sbr))
				System.out.println(" Given string is palindrome");
			
			else
				
				System.out.println("given strig is not palindrome");
			
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		}
	}