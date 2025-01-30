package java1404;

public class ReverseString {
	public static void main(String [] args) {
		String s = " kumar";
		char ch[] = s.toCharArray();
		for( int i = ch.length-1;i>=0;i--) {
			System.out.println(ch[i]);
			
		}
	}

}
