package JavaTpoint;

class ParentClass{
	int num = 10;
	
	void showData() {
		
		System.out.println(" inside ParentClass showData");
		System.out.println(" num="+ num);
	}
}


class ChildClass extends ParentClass{
	
	void showData() {
		System.out.println("Inside ChildClass showData() method");
		System.out.println("num = " + num);
	}
}













public class PurePolymorphism {
	
	
	

	public static void main(String[] args) {
		
		ParentClass obj = new ParentClass();
		obj.showData();
		
		obj = new ChildClass();
		obj.showData();
		
	}


}
