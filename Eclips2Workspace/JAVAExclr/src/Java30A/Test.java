package Java30A;

public class Test {
	int x = 10;
		final int y = 19;
		String fname = "vinit";
		String lname = " doe";
		int age = 23;
		
	public static void main(String [] args) {
		Test A = new Test();// class ch objecht gehtla ahe eht
		Test A1 = new Test();
		
		A.x= 56;
		A1.x=34;
	System.out.println("Name is "+" "+ A.fname);
	System.out.println("Age is "+ " "+ A.age);
	System.out.println(" lname is "+" "+ A.lname);
		System.out.println(A.x);
		System.out.println(A1.x);
		
	}

}
