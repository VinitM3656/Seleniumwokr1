package seleniumpoperties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataFromPropertiesExample {
	
	public static void main(String [] args) {
		try {
			
			FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\seleniumpoperties\\Data1.properties");
			 Properties p = new Properties();
			 
			 p.load(fis);
			 String name = p.getProperty("name");
			 
			 System.out.println("Name is "+name);
			 
			 String age = p.getProperty("age");
			 System.out.println("Age is "+ age);
			 
			 String qaulification= p.getProperty("qualification");
			 System.out.println("Qualification is "+ qaulification);
			 
			 String Experience = p.getProperty("Experience");
			 System.out.println("Experience is "+ Experience);
			 
			
		}catch(Exception e) {
			
			
			
			System.out.println(e.getMessage());
		}
	}

}
