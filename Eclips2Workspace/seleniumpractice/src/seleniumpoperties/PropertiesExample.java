package seleniumpoperties;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesExample {
    
    public static void main(String[] args) {
    	try {
    		FileInputStream fis = new FileInputStream(
    		"D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\seleniumpoperties\\Data.properties");
    		Properties p = new Properties();
    		p.load(fis);
    		String name = p.getProperty("name");
    		System.out.println("Name is " + name);
    		String age = p.getProperty("age");
    		System.out.println("Age is " + age);
    		String qualification =
    		p.getProperty("qualification");
    		System.out.println("The qualification is " +
    		qualification);
    		String experience = p.getProperty("experience");
    		System.out.println("The experience is " +
    		experience);
    		} catch (Exception e) {
    		System.out.println(e.getMessage());
    		}
    		}
    		}