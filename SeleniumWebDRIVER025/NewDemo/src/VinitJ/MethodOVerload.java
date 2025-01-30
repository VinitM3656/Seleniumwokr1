package VinitJ;


class Adder{
	
	
	void add() {
		
		int num1, num2,sum;
		
		
		num1 = 10;
		num2 = 20;
		sum = num1+ num2;
		System.out.println(" the sum is here"+ sum);
		
	}
	
	void add( int a , int b) {
		
		int res; 
		res = a+b;
		System.out.println(res);
	}
	
	void add(float a,float b) {
		float res;
		res = a+b;
		
		System.out.println(res);
	}
	
	
	void add(double a , double b) {
		
		double res;
		res = a+ b;
		System.out.println( res);
		
	}
}



















public class MethodOVerload {
	public static void main(String [] args) {
		
		Adder adder = new Adder();
		adder.add();
		adder.add(20,30);
		adder.add(11.23f,12.12f);
	}

}
