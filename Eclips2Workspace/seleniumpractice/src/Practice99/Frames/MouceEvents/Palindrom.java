package Practice99.Frames.MouceEvents;

public class Palindrom {
	public static void main(String [] args) {
		
		int n = 121;
		int temp= n;
		int r = 0;
		
		int sum = 0;
		
		while(n>0) {
			
			r= n%10;
			n = n/10;
			sum = (sum*10)+r;
			System.out.println(sum);
			
		}
		
		if(temp == sum) {
			System.out.println(" palindrome is number");
			
		}
		else {
			
			System.out.println(" not a palindrome");
		}
	}

}
