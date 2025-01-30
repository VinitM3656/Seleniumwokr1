

class ParentClass{
	
	int a;
	 ParentClass(int a){
		 
		 System.out.println(" this is now constructor");
		 this .a =a;
		 
		 
		 
	 }
	 
	 ParentClass(){
		 System.out.println(" inside constructor in sode");
	 }
}


class ChildClass extends ParentClass{
	
	ChildClass(){
		 System.out.println(" insideclass");
	}

	
	
}

public class Constructor {
	
	public static void main(String [] args) {
		
		ChildClass c1 = new ChildClass();
		
	}

}
