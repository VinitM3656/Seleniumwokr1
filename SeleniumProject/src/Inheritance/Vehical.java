package Inheritance;


abstract class Vehicle {
	abstract void start();
}
class car extends Vehicle{
	 void start() {
		 System.out.println(" car starts with key");
	 }
}

class Scooter extends Vehicle{
void start() {
	System.out.println(" Scooter is starts with key also");
}
}
public class Vehical{
	public static void main(String [] args) {
		car c = new car();
		c.start();
		
		Scooter s1= new Scooter();
		s1.start();
	}
}