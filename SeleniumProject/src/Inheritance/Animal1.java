package Inheritance;

public class Animal12 {
	String name;
	
	public void eat() {
		System.out.println(" i can eat");
	}
}
class Dog extends Animal12{
	public void display() {
		System.out.println(" My name is"+ name);
	}
}
	class Animal1{
		public static void main(String [] args) {
			Dog Ob1= new Dog();
			Ob1.name = " Rahul";
			Ob1.display();
			
			Ob1.eat();
			
		}
	}
