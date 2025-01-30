package SuprajaM;

public class ReverseString {
	public static void main(String [] args) {
		
		String s = " vinit";
		String sarr[]=s.split("");
		for(int i = sarr.length-1;i>=0;i--) {
			
			System.out.println(sarr[i]);
			
		}
	}

}
