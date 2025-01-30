
public class palindromic {
	
	public static void main(String [] args) {
		try {
			
			String str = "120";
			
			String sbr = new StringBuffer(str).reverse().toString();
			
			if(str.equals(sbr))
				System.out.println(" given string is palyndome");
			
			
			else
				
				System.out.println("given string is not polyndrme");
			
		}
		catch(Exception e) {
			
			
			System.out.println(e);
		}
		}
	}