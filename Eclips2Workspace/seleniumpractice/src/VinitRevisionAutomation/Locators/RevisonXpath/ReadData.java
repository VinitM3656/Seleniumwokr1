package VinitRevisionAutomation.Locators.RevisonXpath;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {
	public static void main(String [] args) {
		try {
			
			FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\VinitRevisionAutomation\\Locators\\RevisonXpath\\Config.properties");
		Properties p = new Properties();
		p.load(fis);
		String name = p.getProperty("name");
		System.out.println("Name is "+ name);
		
		String age = p.getProperty("age");
			System.out.println(" age is "+ age);
			
			String qualification = p.getProperty("qualification");
			System.out.println(" qualification is "+qualification);
			
			
			String experience = p.getProperty("experience");
			
			System.out.println(" the experience"+ experience);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
			
			
	}

}
