package Corejava.basics;


class ParentClass{
	
	int num = 10;
	
	void showData() {
		
		
		System.out.println(" insdie the Parentcclass showData method");
		
		System.out.println(" num"+ num);
	}
}

class ChildClass extends ParentClass{
	
void showData() {
		
		
		System.out.println(" insdie the Childcclass showData method");
		
		System.out.println(" num"+ num);
	}
	
	
}

public class Polymorphims {
	
	public static void main(String [] args) {
		ParentClass c1 =  new  ParentClass();
		c1.showData();
		
		ChildClass c2 = new ChildClass();
		c2.showData();
	}

}
