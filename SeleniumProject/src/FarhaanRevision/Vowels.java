package FarhaanRevision;

//package FarhaanRevision;

public class Vowels {
	
	public static void main(String[] args) {
		String str = " a hi welcom";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Given string contains " + ch + " at the index " + i);
			}
		}
	}
}
