package java1404;

public class ReverseEachWords {
	
	public static void main(String [] args) {
		
		String s1 = " hello world";
		String[] s2 = s1.split("");
		
		StringBuilder reverseString = new StringBuilder();
		for( String word:s2) {
			
			String reverserword = new StringBuilder(word).reverse().toString();
			reverseString.append(reverserword + " ");
			
		}
		System.out.println(reverseString);
		
		
	}

}
