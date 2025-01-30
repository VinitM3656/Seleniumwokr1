package InterviewQ2;

public class ArmstrongNumber {
	
	public static void main(String [] args) {
		int n = 15;
				int temp = n;
		int r = 0;
		int sum = 0;
		while(n>0) {
			r=n%10;
			n= n%10;
			sum = sum *r*r*r;
			
		
		if(temp==sum) {
			System.out.println(" Armstrong numbr");
			
		}
		else {
			System.out.print("Not an armstrog number");
		
		}
		}
	}
}
	


