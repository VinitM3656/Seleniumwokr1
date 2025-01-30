package SuprajaM;

class Reactangle{
	
	int length;
	int width;
	
	void setData(int length , int width) {
		this.length= length;
		this.width = width;
		
	}
	
	
	void display() {
		System.out.println(" length "+ this.length);
		System.out.println(" width"+ this.width);
		
	}
}

public class This {

	
	public static void main(String [] args) {
		
		Reactangle R1 = new Reactangle();
		R1.setData(23,233);
		R1.display();
		
		
	}
}
