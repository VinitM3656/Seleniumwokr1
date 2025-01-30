package Revison2704;

import java.io.FileInputStream;
import java.util.Properties;

public class DataRead {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/Eclips/Eclips2Workspace/JAVAExclr/src/Revison2704/Config.properties");
            Properties p = new Properties();
            p.load(fis);

            String name = p.getProperty("name");
            System.out.println("Name is " + name);

            String age = p.getProperty("age");
            System.out.println("Age is " + age);

            String qualification = p.getProperty("qualification");
            System.out.println("The qualification is " + qualification);

            String experience = p.getProperty("Experience"); // Corrected the key
            System.out.println("The experience is " + experience);
            
            String Hobbie = p.getProperty("Hobbie");
            System.out.println(" the Hobbie is "+Hobbie);

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                System.out.println("Error while closing FileInputStream: " + e.getMessage());
            }
        }
    }
}
