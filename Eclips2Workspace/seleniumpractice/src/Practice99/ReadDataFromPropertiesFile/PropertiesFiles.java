package Practice99.ReadDataFromPropertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFiles {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Eclips\\Eclips2Workspace\\seleniumpractice\\src\\Practice99\\ReadDataFromPropertiesFile");
            Properties p = new Properties();//object of propertis
            p.load(fis);//load the file
            String name = p.getProperty("name");
            System.out.println(" name is "+ name);
            
            String age = p.getProperty("age");
            System.out.println("age is "+ age);
            
            
            String Experience = p.getProperty("Experiece");
            System.out.println(" Experience is "+ Experiecne);
        }
        Catch(Excpetion e){
        	System.out.println()
        }