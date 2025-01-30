package SuprajaM;


class Animal{
	void eat() {
		
		System.out.println(" eating ....");
		
	}
}
class Dog extends Animal{
	void bark() {
		
		System.out.println(" bhobhoo");
		
	}
	
	
	class cat extends Animal{
		void Meow() {
			System.out.println(" meow mewo");
			
		}
	}
}

public class Inheritance {

	
	public static void main(String [] args) {
		
		
		Animal An = new Animal;
		An.bark();
		
		
	}
}
