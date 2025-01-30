package java1404;

abstract class Bike{
	
	Bike1(){
		System.out.println(" bike is created");
		
	}
	
	abstract void run();
	{
	  System.out.println(" bike is running");
	  
	}
	
	class Honda extends Bike{
		void run() {
			System.out.println(" bike is running safely");
		}


public class Abstract3 {
	
	public static void main(String [] args) {
		
		Bike Obj1 = new Bike();
		Obj1.run();
		
	}


}
