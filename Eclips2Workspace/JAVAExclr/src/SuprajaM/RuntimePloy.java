package SuprajaM;



public class Bike{
	
	void run() {
		
		System.out.println(" bike is running safely");
		
	}
	
	static class Splender extends Bike{
		
		//@override
		
		void run() {
			
			System.out.println(" bike is running is safely");
			
		}
	}
	
public class RuntimePloy {
	
	public void main(String [] args) {
	
		Bike bike = new Bike();
		bike.run();
		
		
	}
	}

}
