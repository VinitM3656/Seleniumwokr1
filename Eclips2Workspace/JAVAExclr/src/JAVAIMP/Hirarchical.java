package JAVAIMP;


class ParentClass{
	
	int a;
	void setData(int a) {
		this.a=a;
	}
}
class ChildClass extends ParentClass{
void showData() {
	
	System.out.println("inside child class");
	System.out.println(" value of a is"+a);
}
}

class ChildClassToo extends ParentClass{
	void display() {
		
		System.out.println("Inside childclass");
		System.out.println("Value of a is"+""+ a);
		
	}
}








public class Hirarchical {
	public static void main(String [] args) {
		ChildClass child_obj = new ChildClass();
		
		child_obj.setData(100);
		child_obj.showData();
		
		
		
		ChildClassToo childToo_obj = new ChildClassToo();
		
		childToo_obj.setData(200);
		
		childToo_obj.display();
	}

}
