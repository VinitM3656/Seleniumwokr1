package java1404;


class Animal{
	
	
	void eat() {
		System.out.println(" eating");
		
	}
}


class Dog extends Animal{
	void eat() {
		System.out.println(" Dog is eating");
	}
	
	void bark() {
		System.out.println(" dog is barking");
	
	
super.eat();
	}
}



public class SuperC {
	public static void main(String [] args) {
		Dog d = new Dog();
		d.eat();
		
	}

}
