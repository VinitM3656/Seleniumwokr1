package Java30A;
 final class ParentClass{
	
	int num = 10;
	final void showData1() {
		
		System.out.println("inside Parentclass");
		System.out.println("num="+ num);
	}
}


class ChildClass extends ParentClass{
	
	void showData() {
		System.out.println(" insde the child clasa");
	}
}


public class Final {
	public static void main(String [] args) {
		
		ChildClass obj = new ChildClass();
		obj.showData();
		
	}
}
	