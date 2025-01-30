package java1404;


class Vehicle{
	void run() {
		System.out.println(" vehicle is runnig");
		
	}
	
	
	// creating a child class
	
	
	class Bike2 extends Vehicle{
		
		void run() {/// define the same method as in parent class
			System.out.println(" bike is running safely");
			
			
		}
		
	}
}

public class Override {
	public static void main(String [] args) {
		Bike obj = new Bike();
		obj.run();
	}

}
