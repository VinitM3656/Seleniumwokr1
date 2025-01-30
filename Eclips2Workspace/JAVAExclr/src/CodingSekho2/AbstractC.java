package CodingSekho2;

abstract class USA{//declaration methods
	int x ; 
	int y;
	 USA(){///initlization method
		 x= 10;
		 y= 23;
		 
	 }
	 
	 void fun1() {
		 System.out.println(" fun1 is executed");
		 
	 }
	 abstract void fun2();
}

class UK extends USA{
	void fun2() {
		System.out.println(" Overrddeenr fun2 is here");
	}
}

public class AbstractC {
	public static void main(String [] args) {
		UK u1= new UK();
		u1.fun2();
		
	}

}
