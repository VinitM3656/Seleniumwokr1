package JAVAIMP;

class ParentClass1{
	
	
	int a;
	void setData(int a) {
		this.a=a;
		
	}
}

class ChildClass extends ParentClass1{
	
	void showData() {
		
		System.out.println(" value of a is"+ a);
	}
}

class ChildChildClass extends ChildClass{
	void display() {
		
		System.out.println(" inside the childclass");
	}
}















public class MultiLevelInheri {
	public static void main(String [] args)
	{
		ChildChildClass obj = new ChildChildClass();
		obj.setData(120);
		obj.showData();
		obj.display();
	}
}
