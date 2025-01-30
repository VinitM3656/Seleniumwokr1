package NewJavaPrograms;
import java.util.Scanner;

public class Odd_Even {
public static void main(String [] args) {
	
	int num;
	Scanner s = new Scanner(System.in);
	System.out.println(" enter the fucking number");
	num= s.nextInt();//nextInt(): method are used for get integer type value from keyboard.
if( num%2==0) {
	
	System.out.println(" its fucking even number");
	
}
else {
	System.out.println("its fucking off number");
}
}
}