package Java30A;

public class Class2 {
	public void fullThrottle() {
		System.out.println(" the car is going very fast");
		
	}
	
public void speed(int maxspeed)
{
	System.out.println("Max speed is"+ maxspeed);
	
	
}
}

class Second{
	public static void main(String [] args) {
		Class2 A = new Class2();
		A.fullThrottle();
		A.speed(200);
	}
}