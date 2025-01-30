import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataFromPropertiesExample {
	
	public static void main(String [] args) {
		try {
			
			
			FileInputStream fis = new FileInputStream("  D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\config.properties");
					
		Properties p = new Properties();
		
		p.load(fis);
		
		String name = p.getProperty("name");
		
		System.out.println("Name is "+name);
		
		String age = p.getProperty("age");
		
		System.out.println(" age is"+age);
		
		String qualification= p.getProperty("Qualification");
		
		System.out.println(" the qualification is"+ qualification);
		
		String Experience  = p.getProperty("Experience");
		
		System.out.println(" the experience is"+ Experience);
		
			
		} catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			
		}
	}

}
