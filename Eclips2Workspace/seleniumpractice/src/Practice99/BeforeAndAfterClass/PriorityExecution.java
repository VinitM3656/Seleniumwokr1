package Practice99.BeforeAndAfterClass;

import org.testng.annotations.Test;

public class PriorityExecution {
	@Test(priority=4)		
	void TestMethod4() {
			System.out.println(" Test Method 1 is called");
			
		}
		@Test(priority=2)
			void testmethod2() {
				System.out.println(" Test Method2 is execute");
				
			}
			@Test(priority=3)
				void testmethod3() {
					System.out.println(" test method 3 is executed");
					
				}
			
			
			@Test(priority=-1)
			void testmethod9(){
				System.out.println(" Test method 5665656ecuteed");
			}
	
			
			
			
				@Test(priority=5)
				void testmethod() {
					System.out.println(" Test method 5 is executed");
				}	
				
			@Test(priority=5)
			void testmethod6(){
				System.out.println(" Test method 5 is executeed");
			}
	
			
		@Test(priority=0)
			void testmethod7(){
				System.out.println(" Test method 576s executeed");
			
	}
}

