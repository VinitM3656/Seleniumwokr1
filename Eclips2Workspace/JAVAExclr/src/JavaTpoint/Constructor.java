package JavaTpoint;



class ParentClass{
	int a;
	ParentClass(){
		System.out.println(" now inside constructor");
	}
}

class ChildClass extends ParentClass{
	ChildClass(){
		System.out.println(" now again in constructor");
	}
}

class ChildClass2 extends ChildClass{
	
	ChildClass2(){
		System.out.println("insdie grandsons class");
	}
}
public class Constructor {
public static void main(String [] args) {
	ChildClass2 obj = new ChildClass2(); 
}
}
