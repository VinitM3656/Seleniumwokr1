package JavaTpoint;



class ParentClass{
	int a ;
	void setData(int a) {
		this.a=a;
		
	}
}
class childclass extends ParentClass{
	 void showData() {
		 
		 System.out.println(" inside chilclass");
		 System.out.println(" value of a is "+a);
		 
	 }
}

class Childclass2 extends ParentClass{
	
	void display() {
		System.out.println(" inside child class2");
		System.out.println(" value of a is"+a);
	}
	
}













public class HierarchicalInheritance {
	public static void main(String [] args) {
		
	

	childclass obj = new childclass();
	obj.setData(22323);
	obj.showData();
	
	Childclass2 obj2 = new Childclass2();
	
	obj2.setData(343434);
	obj2.display();
}
}
