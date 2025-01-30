package java1404;


class Animal{
	
	void eat() {
		
		
		System.out.println(" eating");
	}
}

class Dog extends Animal{
	
	
	void bark() {
		System.out.println(" dog is barkgin");
		
		
	}
	
}
class Cat extends Animal{
	void cat() {
		System.out.println(" cat is eating");
		
	}
}

public class Inheriatnce {
	public static void main(String [] args) {
		
	

 Cat c1 = new Cat();
 
 c1.cat();
	}
}


