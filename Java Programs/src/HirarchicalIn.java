
class ParentClass{
	int a ;
	
	void setData(int a) {
		this.a=a;
		
	}
}


class ChildClass extends ParentClass{
	
	
	void showData() {
		System.out.println(" inside ChildClass");
		System.out.println(" value of a is "+ a);
	}
}


class SecondChild extends ParentClass{
	void dip() {
		System.out.println(" inside again SecondChild");
		System.out.println(" value of its "+a);
		
	}
}










public class HirarchicalIn {
	 public static void main(String [] args) {
		 
		 SecondChild C1 = new SecondChild();
		 C1.setData(345);
		 C1.dip();
		 
		 
	 }

}
