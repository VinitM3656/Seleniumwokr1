package Java30A;

public class Constructor {
	
	int x ;/// class attribute;
	
	// now creating construcotr in class 
	
	public Constructor() {
		
		x= 5;
		
	}
	
	public static void main(String [] args) {
		Constructor C1 = new Constructor();
		System.out.println(C1.x);
	}
	

}
