package VinitJ;

public class ArthematicOperation {
	public static void main(String [] args) {
		
		int a = 10, b= 20, result;
		
		System.out.println("a"+ a+ "b"+ b);
		
		result = a+b;
		System.out.println(" Addition is "+ a+ " "+ b);
		
		result = a-b;
		System.out.println(" sub is "+ a+" "+ b);
		
		result= a*b;
		System.out.println( " mul is "+ a+" "+ b);
		
		result = b/a;
		System.out.println("Div is"+ a+ " "+ b);
		
		result= ++a;
		System.out.println(" preincrement"+ a);
		result = b --;
		System.out.println( "Post - decrement b--"+ result);
		
		
	}

}
