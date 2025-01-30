package JavaExclerRevision;

public class MethodOverloading23 {
	
	static int addmethod(int x ,int y) {
		return x+y;
	}
static double addmethod(double x, double y) {
	return x+y;
}

	public static void main(String [] args) {
		
		int mynum1 = addmethod( 4,5);
		double mynum2= addmethod( 6.6,5.6);
		System.out.println("int "+ mynum1);
		System.out.println( " double"+ mynum2);
		
	}
	
	}