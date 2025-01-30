package JavaPrograms.IFElse;

public class StaticAndInstance {
	public static void main(String[] args, StaticAndInstance StaticAndInstance) {
		display();////calling without object
		
		StaticAndInstance = new StaticAndInstance ();
		JavaPrograms.IFElse.StaticAndInstance t;
		t.show(); ////calling using object
	}
	static void display() {
		System.out.println("Programming is amazing");
	}
	void show() {
		System.out.println("Java is awesome");
		
		
	}

}
