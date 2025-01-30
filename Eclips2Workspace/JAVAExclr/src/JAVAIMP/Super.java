package JAVAIMP;


class ParentClass{
	int num = 10;
	
}
 class childclass extends ParentClass{
	 
	 int num = 29;
	 
	 void showData() {
		 
		 System.out.println(" inside the childclass");
		 System.out.println(" child class run");
		 System.out.println(" parentclass constructor"+ super.num);
		 
		 
	 }
 }












public class Super {
 public static void main(String [] args)
{
	 
	ChildClass obj = new ChildClass();
	 
	obj.showData();
	
	System.out.println("\nInside the non-child class");
	System.out.println("ChildClass num = " + obj.num);
	//System.out.println("ParentClass num = " + super.num); //super can't be used here

}

}