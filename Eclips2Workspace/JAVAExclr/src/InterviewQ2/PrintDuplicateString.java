package InterviewQ2;

public class PrintDuplicateString {
	public static void main(String[] args) {
		try {
			float f1 = new Float(" 3.0");
			
			int x = f1.Value();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(x+ b+ d);
			
		}
		catch(NumberFromatException e )
		{
			System.out.println("bad number");
			
		}