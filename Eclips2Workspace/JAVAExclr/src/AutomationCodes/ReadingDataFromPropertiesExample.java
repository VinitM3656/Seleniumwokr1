package AutomationCodes;

import java.io.FileInputStream;

public class ReadingDataFromPropertiesExample {
	
	public static void main(String [] args) {
		try {
			
			
			FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\JAVAExclr\\src\\AutomationCodes\\Config.properties");
			Properties p = new Properties();
			
			p.load(fis);
			
			String name = p.getProperties("name");
			System.out.println("Name is"+name);
			
			String age = p.getProperties("age");
			System.out.println("Age is"+ age);
			
			String qualification = p.getProperties("qualificaton");
			System.out.println(" qualification is "+ qualification);
			
			String Experience = p.getProperties("Experience");
			System.out.println(" Experience is "+ Experience);
			
				
				
			} catch(Exception e) {
				
				System.out.println(e.getMessage());
				
		}
	}

}
