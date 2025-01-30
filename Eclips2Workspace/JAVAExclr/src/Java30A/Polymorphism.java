package Java30A;

class ParentClass{
	
	int num = 10;
	void showData() {
		
		System.out.println(" inside ParentClass showData method");
		System.out.println(" num"+ num);
	}
}

class ChildCLass extends ParentClass{
	
	void showData() {
		System.out.println(" inside ChildClass showData methd");
	}
}


public class Polymorphism {
public static void main(String [] args) {
	ParentClass obj = new ParentClass();
	obj.showData();
	
	obj= new ChildClass();
	obj.showData();
}

}
