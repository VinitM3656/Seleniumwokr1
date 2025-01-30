package JavaTpoint.elseif;

public class elseif {
	
	public static void main(String [] args) {
		
		
		int marks = 30;
		if( marks <=50) {
			System.out.println(" i am fail");{
			
			}
		}
			
			
			
			else if(marks >= 50){
				System.out.println(" i am not fail");
				
			}
			
			else if( marks>=51 && marks<=60) {
				System.out.println(" i am in firstclass");
				
			}
			else if( marks>=80 && marks<=90) {
				System.out.println("distinction");
				
			}
			else {
				
				System.out.println(" invalid");
			}
		
		
	}
}

