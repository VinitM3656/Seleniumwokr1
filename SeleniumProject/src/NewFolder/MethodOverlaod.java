package NewFolder;

public class MethodOverlaod {
	
	static int AddMethod( int x , int y) {///same method name but different para and we can alos diff method name and diff( data type) para
		return x+y;
	}
	static double AddMethod( double x, double y) {//same method nama
		return x+y;
		
	}
	public static void main(String [] args) {
	int Num1 = AddMethod( 4,5);
	double Num2 = AddMethod( 4.5,5.6);
	 System.out.println( Num1+ " "+ Num2);
	}
	}
	