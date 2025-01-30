package JavaTpoint;

public class Armstrong {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=153;
		int temp=n;
		int r=0;
		int sum=0;
		
		while(n>0) {
		r=n%10; //3, 5, 1
		n=n/10; //15, 1,0
		sum=sum+r*r*r;//27,152,153
					
		}
		if(temp == sum) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not Amstrong Number");
		}
	}

}

