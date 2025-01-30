package Practice99.Frames.MouceEvents;

public class Plaindrome {
	
	public static void main(String [] args) {
	try {
		
		String str = "121";
		
		String  sbr = new StringBuffer(str).reverse().toString();
		
		if(str.equals(sbr))
			System.out.println("Givern string is palyndrom");
		else 
			System.out.println("given string is not palyndrome");
		} catch(Exception e) {
			System.out.println(e);
	
	}
	}

}
