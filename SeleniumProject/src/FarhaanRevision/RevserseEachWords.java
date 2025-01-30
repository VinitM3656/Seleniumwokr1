package FarhaanRevision;

public class RevserseEachWords {///givis spaces
	
	public static void main(String [] args) {
		String s1 = " hello world";
		String [] s2= s1.split("");
		
		StringBuilder reverString = new StringBuilder();
		
		for(String word :s2) {
			String reverseWord = new StringBuilder(word).reverse().toString();      
		    reverString.append(reverseWord + " ");                                
		}
		 
		System.out.println( reverString ); 
	}
}
/*   

The input string "Hello world" is assigned to the variable s1.
The split() method is used to split the input string s1 into an array of words, based on the space character " ". Each word is stored in the array s2.
A StringBuilder named reverseString is initialized to store the reversed words.
A for-each loop iterates through each word in the array s2.
Inside the loop, each word is reversed using the reverse() method of StringBuilder. The reversed word is then converted to a string using toString() method and stored in the reverseWord variable.
The reversed word is appended to the reverseString with a space character, using the append() method.s
After processing all the words, the reverseString contains the reversed version of each word separated by spaces.
Finally, the reversed string is printed using println() method.
So, the output of the program will be "olleH dlrow " which are the reversed versions of "Hello" and "world" with a space in between.*/