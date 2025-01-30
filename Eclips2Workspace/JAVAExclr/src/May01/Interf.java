package May01;


interface USA{
	int x = 56;
	void fun1();
	
}
class Uk implements USA{
	public void fun1() {
		System.out.println("Overridden fun1");
	}
	
	void fun2() {
		System.out.println(x);
		
	}
}
public class Interf {
public static void main(String [] args) {
	USA u1 = new Uk();
	u1.fun1();
}
}
