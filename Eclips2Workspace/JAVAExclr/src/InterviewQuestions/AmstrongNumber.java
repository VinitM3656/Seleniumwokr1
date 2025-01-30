package InterviewQuestions;

public class AmstrongNumber {
	public static void main(String [] args) {
		
		int num = 153;
		int rem = 0;
		int temp = 0;
		int sum = 0;
		
		while( num>0) {
			rem = num%10;
			num = num%10;
			sum = sum+rem*rem*rem;
			
		}
		
		
	 if( temp == sum) {
		System.out.println(" its arnstrong numbe");
		
	}else {
		System.out.println(" its not armstrrong nume");
}
}

}