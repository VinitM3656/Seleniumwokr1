package JavaTpoint;

public class Wrapper {
	
	public static void main(String [] args) {
		
		int a = 23;
		Integer Intobj = new Integer(a);
		
		
		String str = " vinit";
		String str1 = new String(str);
		
		Double Doub = 23.34;
		Double Doub1 = new Double(Doub);
		
		Float f = 45.4f;
		Float Fobj = new Float(f);
		
		
		System.out.println(" the wrapper value of int a is "+ " "+(a));
		
		System.out.println(" the wrapper value of string str is"+(str));
		
		System.out.println(" the wrapper value of double is"+(Doub));
	} 
		
	}