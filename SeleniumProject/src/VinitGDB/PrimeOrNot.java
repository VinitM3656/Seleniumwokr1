package VinitGDB;

public class PrimeOrNot {
	public static void main(String[] args) {
		int n = 11;
		int i = 2;
		int flag = 0;
		
		while(i <= n/2) {
			if(n%i == 0) {
				flag = 1;
				break;
			}
			i++;
		}
		if(flag ==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not Prime");
			
			
		}
	}

}
