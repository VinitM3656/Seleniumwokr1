package Java30A;

public class AccessSp {
	
	final int x = 10;
	final double PI = 3.13;
	

	
	public static void main(String [] args) {
		AccessSp Obj = new AccessSp();
			Obj.x=50;//
		Obj.PI = 45;// this will generates errr bcz we are accessinf ffinal 
		System.out.println(Obj.x);
	}
}
