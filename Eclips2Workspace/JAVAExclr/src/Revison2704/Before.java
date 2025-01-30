package Revison2704;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before {
	
		
		@BeforeClass
		void beforeclass() {
			System.out.println(" befoe class called");
			
			
		}
		
		@AfterClass
		void Afterclass() {
			System.out.println(" after class is called");
			
		}
		
		@AfterClass
	void Afterclass1(){
			System.out.println(" after class is joiined");
			
			
		}
		
		@Test
		void Test() {
			System.out.println(" test metod is executed");
			
			
		}
		
	}

}
