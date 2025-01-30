package JavaPrograms.IFElse;

public class StaticAndPublic {
	static void StaticMethod() {
		System.out.println(" Static method is calling witout obj create");
		
	}
	
	public void PublicMethod() {
		System.out.println("Public method with obj creat");
		
	}
public static void main(String [] args) {
	StaticMethod();//called static method
	
	StaticAndPublic MyObj= new  StaticAndPublic();{//obj of main method
		MyObj.PublicMethod();////called public method
	}
	
	}
}