package JAVAIMP;



class ParentClass{
	
	int a; 
	
	void setData(int a) {
		this.a=a;
	}
}
class ChildClass extends ParentClass{
	void showData() {

System.out.println(" value of a is "+a);
}
}







public class InheritanceExampleApplication {

	public static void main(String [] args) {
		
		ChildClass obj= new ChildClass();
		
		obj.setData(100);
		obj.showData();
		
	}
}
