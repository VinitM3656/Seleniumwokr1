package JavaTpoint;

import java.util.Arrays;

public class SortStringAlpha {
	
	
	public static void main(String [] args) {
		
		
		String input ="wednesday";
		char charArray[]=input.toCharArray();
		Arrays.sort(charArray);
		
		System.out.println(new String( charArray));
	}

}
