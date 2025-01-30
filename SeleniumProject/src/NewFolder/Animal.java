package NewFolder;

public class Animal {
	
	public void animalSound(){
		System.out.println(" the animal sounds like");
	}
	}

class pig extends Animal{
	public void animalSound() {
		System.out.println(" the pig sounds like");
	}
	
	}

class Dog extends Animal{
	public void animalSound() {
		System.out.println(" the dog make bhow bhow");
		
	}
	public static void main(String [] args) {
		class Main{
			 Animal myAnimal = new Animal();  // Create a Animal object
			    Animal myPig = new Pig();  // Create a Pig object
			    Animal myDog = new Dog();  // Create a Dog object
			    myAnimal.animalSound();
			    myPig.animalSound();
			    myDog.animalSound();
	
		}
		
	}

}
