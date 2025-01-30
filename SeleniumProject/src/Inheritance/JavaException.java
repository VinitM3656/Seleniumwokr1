package Inheritance;

public class JavaException {
	public static void main(String [] args) {
		
		       try {
			int [] num= { 1,2,3,4};
			System.out.println(num[10]);
		} 
		       
		       
		       catch(Exception e) {
			System.out.println(" we got error");
			
		} 
		       
		       finally {
		      System.out.println("The 'try catch' is finished.");
	}

}
}
