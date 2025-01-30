package JAVAIMP;


class ParentClass{
	
	int a;
	ParentClass(){
		
		System.out.println("Inside ParentClass constructor");
	}
}

class ChildClass extends ParentClass{
  ChildClass(){
	  System.out.println(" Inside the childclass constructor");
  }

public void showData() {
	// TODO Auto-generated method stub
	
}
	
}
class ChildChildClass extends ChildClass{
	
	ChildChildClass(){
		
		System.out.println(" Inside childconstruot");
		
	}
}









public class Constructed {
	
public static void main(String [] args) {
	ChildChildClass obj = new ChildChildClass();
}

}
