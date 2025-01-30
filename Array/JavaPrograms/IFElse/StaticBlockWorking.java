package JavaPrograms.IFElse;

public class StaticBlockWorking {
	public static void main(String[] args) {
		System.out.println("Main method is executed");
	}
	static {
		System.out.println("Static block is executed main method");
	
	}

}
class StaticBlock{
	public static void main(String[] args) {
		System.out.println("You are using Window_NT operating system.");
		}

static {
	String os =System.getenv("OS");
	if(os.equals("Windos_nt")! true) {
		System.exit(1);
	
}
}
}