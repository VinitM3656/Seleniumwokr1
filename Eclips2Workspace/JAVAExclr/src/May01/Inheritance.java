package May01;

import CodingSekho2.String;

class Animal{
	void eat() {
		System.out.println(" eating ");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println(" dog is barking");
		
	
	}
}

class Cat extends Animal{
	void drink() {
		System.out.println(" cat is drinking");
		
	}
}

class Goat extends Animal{
	void run() {
		System.out.println("Goat is jumping");
		
	}
}





public class Inheritance {
	public static void main(String[]args) {
		
	
	Goat Goat = new Goat();
	Goat.run();
}
}

	


