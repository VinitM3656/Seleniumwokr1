package AutomationCodes;

import java.io.FileInputStream;
import java.io.IOException;
//import java.util.Properties;

public class Properties {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\JAVAExclr\\src\\AutomationCodes\\Config.properties");
            Properties p = new Properties(); // Creating Properties object
            p.load(fis); // Loading properties from file
            
            String name = p.getProperties("name"); // Corrected method name
            System.out.println("Name is " + name); // Corrected concatenation

            String age = p.getProperties("age"); // Corrected method name
            System.out.println("Age is " + age); // Corrected concatenation

            String qualification = p.getProperties("qualification"); // Corrected method name
            System.out.println("The qualification is " + qualification); // Corrected concatenation

            fis.close(); // Closing FileInputStream
        } catch (IOException e) { // Corrected Exception type
            System.out.println(e.getMessage()); // Corrected method name
        }
    }

	private void load(FileInputStream fis) {
		// TODO Auto-generated method stub
		
	}

	public String getProperties(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
