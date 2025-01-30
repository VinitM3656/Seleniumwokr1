


		abstract class animal{///abstract method doesnot have any body
			
			public abstract void AnimalSound();
			public void sleep() {
				System.out.println(" zzzzz");
				
			}
		}			
			class Pig extends animal{
				public void AnimalSound() {
					System.out.println("the pig says : wee wee");
					
				}
			}
			public class Main {
				public static void main(String [] args) {
					//public static void main(String[] args) {
					    Pig myPig = new Pig(); // Create a Pig object
					    myPig.AnimalSound();
					    myPig.sleep();
					  }
					}

