package May01;

public class Fact {
	public static void main(String [] args) {
		int n = Integer.parseInt(args[0]);
		int i = 4;
		int fact = 1;
		while(i<=n) {
			fact = fact*i;
			i++;
			
		}
		System.out.println(" factorial is "+n+"fact");
		
	}

}
