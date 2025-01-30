package Souyamadam;

public class ReverseString {
	
	public static void main(String [] args) {
		
		String str= " vinit";
		
		String sbrr[] = str.split("");
		for(int i = sbrr.length-1;i>=0;i--) {
			System.out.println(sbrr[i]);
		}
		
	}
		}