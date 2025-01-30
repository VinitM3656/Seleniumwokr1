package SuprajaM;

class India{
	int x,y;
	
	
}

class Ukrain extends India{
	
	int x,y;
	
	void setdata(int p , int q) {
		int x,y;
		super.x=p;
		super.y=q;
		
	}
	
	void display() {
		
		System.out.println(super.x);
		System.out.println(super.y);
		
	}
}











public class SuperKey {

public static void main(String [] args) {
	
	Ukrain u1 = new Ukrain();
	u1.setdata(23,23);
	u1.display();
}
}
