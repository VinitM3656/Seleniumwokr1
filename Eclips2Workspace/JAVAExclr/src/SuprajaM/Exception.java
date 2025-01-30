package SuprajaM;

public class Exception {

	public static void main(String[] args) {
		
		int a = 5;
		
		int b = 7;
		
		try {
			
			if(b==0) {
				
				throw new ArithmeticException(" why you are dividing with o");
			}
			
			System.out.println(a/b);
			
		}
		
		catch(NullPointerException e1) {
			
			System.out.println(e1.getMessage());
			
		}
		finally {
			
			System.out.println(" finally excecuted");
			
		}
		
		System.out.println("Normaal Line");
		
		
		
		// TODO Auto-generated method stub

	}

}
