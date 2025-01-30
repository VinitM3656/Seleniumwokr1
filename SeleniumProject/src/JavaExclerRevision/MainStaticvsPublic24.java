package JavaExclerRevision;

public class MainStaticvsPublic24 {
	
	static void SimpleMethod() {
		System.out.println(" hello good morning");
		
	}
	
	public void SimpleMethod1() {
		System.out.println(" hello o my man");
	}
	
	
	
	
	public static void main(String[] args) {
		
		SimpleMethod();
		
		MainStaticvsPublic24 MyObj= new MainStaticvsPublic24();
		MyObj.SimpleMethod1();
	}
		
		
	}