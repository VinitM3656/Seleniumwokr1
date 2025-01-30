package FarhaanRevision;

public class GivenStringPalendrom {
	public static void main(String [] args) {
		try {
		          String str = " 16564564564";
		          String sbr = new StringBuffer(str).reverse().toString();
		          if(str.equals(sbr))
		        	  System.out.println("Given string is palendrome");
		          System.out.println(" gigen String is not palendrom");
		} catch(Exception e) {
			System.out.println(e);
		
		        	  
		}
	}

}
