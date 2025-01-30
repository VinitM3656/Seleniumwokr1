package JavaPrograms.IFElse;

public class OverriteValueOfObject3 {
	 final int x = 4;
	
	public static void main(String [] args) {
		OverriteValueOfObject3 	myObj = new OverriteValueOfObject3();
		
		myObj.x = 98;
		
		System.out.println(myObj.x);
	
	
		
	}
////The final keyword is useful when you want a variable to always store the same value, like PI (3.14159...).
}
