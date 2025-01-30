package seleniumpoperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDATA {
	
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\vinit\\Desktop\\Old Firefox Data\\New folder\\New folder\\Config.properties");
            
            Properties p = new Properties();
            p.load(fis);

            String name = p.getProperty("name");
            System.out.println("Name is " + name);

            String age = p.getProperty("age");
            System.out.println("Age is " + age);

            String qualification = p.getProperty("qualification");
            System.out.println("Qualification is " + qualification);

            String experience = p.getProperty("Experience");
            System.out.println("Experience is " + experience);

        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Error closing FileInputStream: " + e.getMessage());
                }
            }
        }
    }
}
