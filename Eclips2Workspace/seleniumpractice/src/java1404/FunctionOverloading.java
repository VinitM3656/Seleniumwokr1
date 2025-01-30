package java1404;

class USA{
	
	int x ,y ;
	
	void fun1() {
		
		x= 23;
		
		System.out.println(x);
		
	}
}

class Uk extends USA{
	void fun1 (int p){
		+
		y= p;
		System.out.println(y);
		
	}
}



















public class FunctionOverloading {
 public static void main(String [] args) {
	 Uk u1 = new Uk();
	 u1.fun1();
	 u1.fun1(44);
	 
 }
}
