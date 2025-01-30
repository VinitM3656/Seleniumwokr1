package Java30A;

public class Main3 {
	static void MyMethod() {
		System.out.println(" heelo we are learnign methods now be carefull");
	}
	
	
	static void MyMethod(String fname) {
		System.out.println(fname+" "+"refers");
	}
	
	
	static  void MyMethod1(String fname,int age) {
		System.out.println(fname+ "is"+ age);
	}
	
	
	static int plusMethod(int x ,int y) {
		return x+y;
		
	}
	static double plusMethod(double x, double y) {
		return x+y;
		
	}
	
	
	public static void main(String [] args) {
		MyMethod();
		MyMethod();
		MyMethod();
		
		
		MyMethod(" vinit");
		MyMethod(" abhinshek");
		MyMethod(" rushieks");
		
int MyNum1 = plusMethod(8,9);

double mynum2 = plusMethod(4.5 ,5.6);

System.out.println("int: " + MyNum1);
System.out.println("double: " + mynum2);
	


		MyMethod1("vinit",6);
		MyMethod1(" rushies",29);
		MyMethod1(" anjan",34);
		// now jaava with method paramaeters//
		//now mwthodoverloading
		
		
		
		
	}
	}