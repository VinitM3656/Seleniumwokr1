package SuprajaM;


class Adder{
	static int add(int a ,int b) {
  return a+b;
  
	}
	
	
	static int add( int a , int b , int c) {
		
		return a+b+c;
		
	}
}







public class MethodOverload {

	
	public static void main(String [] args) {
		
		System.out.println(Adder.add(11,22));
		
		System.out.println(Adder.add(12,23,45));
		
	}
}
