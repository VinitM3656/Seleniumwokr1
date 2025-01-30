
interface Human{
	
	void larn(String str);
	
	void work();

	
	
	
	int duration= 10;
}

 class Program implements Human{
	public void learn(String str) {
		System.out.println(" learn using "+ str);
		
	}
	
	public void work() {
		
		System.out.println(" now we re taking methods from interface");
	}
	
}

public class HumanTest {
	
	public static void main(String [] args) {
		
		Program obj = new Program();
		obj.larn(" coding");
		obj.work();
		
	}

}
