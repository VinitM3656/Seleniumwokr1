package FarhaanRevision;

public class ReverseNumber {
	public static void main(String [] args)
	{
		String s1 = " 123";
		StringBuilder s2 = new StringBuilder(s1);///OBJECT OF StringBuilder
		s2.reverse();
		System.out.println(s2);
		
	}

}
/*  The string str is initialized with the value "a Hi Welcomea".
A for loop is used to iterate over each character in the string. The loop runs from index 0 to the length of the string.
Inside the loop, each character of the string is checked using the charAt(i) method. If the character is one of the vowels ('a', 'e', 'i', 'o', 'u'), then a message is printed indicating that the given string contains the vowel at the current index i.
The message includes the vowel found (str.charAt(i)) and its index in the string (i).
The loop continues until all characters in the string have been checked.*/