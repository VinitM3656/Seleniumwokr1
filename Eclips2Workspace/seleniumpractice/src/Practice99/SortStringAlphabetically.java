package Practice99;

import java.util.Arrays;

public class SortStringAlphabetically {
	
	public static void main(String [] args) {
		
		String input = " Wednesday";
		char charArray[] = input.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		
	}

}
