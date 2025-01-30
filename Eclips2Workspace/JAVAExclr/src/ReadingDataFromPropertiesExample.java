import java.io.FileInputStream;
import java.util.Properties;

public class ReadingDataFromPropertiesExample {
    public static void main(String[] args) {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\JAVAExclr\\src\\config.properties");

            Properties p = new Properties();
            p.load(fis);

            String name = p.getProperty("name");
            System.out.println("Name is: " + name);

            String age = p.getProperty("age");
            System.out.println("Age is: " + age);

            String qualification = p.getProperty("qualification");
            System.out.println("Qualification is: " + qualification);

            String experience = p.getProperty("Experience");
            System.out.println("Experience is: " + experience);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    System.out.println("Failed to close the file input stream: " + e.getMessage());
                }
            }
        }
    }
}
