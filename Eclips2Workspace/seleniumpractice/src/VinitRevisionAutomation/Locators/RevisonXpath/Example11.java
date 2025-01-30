package VinitRevisionAutomation.Locators.RevisonXpath;


class Nokia1{
	
	
	int x,y;
	void SetData() {
		
		x=10;
		y=20;
		
	}
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
		
	}
}









public class Example11 {
	public static void main(String [] args)
	{
		
		Nokia1 a1 = new Nokia1();
		
		Nokia1 a = new Nokia1();
		a1.SetData();
		a1.display();
		
	}
}
