package JavaTpoint;




class ParentClas{
	int a ;
	void setData(int a) {
		this.a=a;
	}
}
class childClass extends ParentClass{
	void showData() {
		
		System.out.println("value of a is"+ a);
	}
}

class childclass2 extends ParentClass{
	void display() {
		System.out.println(" inside ChildClass");
	}
}

public class MultiInher {
 public static void main(String [] args) {
	 childclass2 obj = new childclass2();
	 obj.setData(13323);
	 //obj.showData();
	 obj.display();
	 
 }
}
