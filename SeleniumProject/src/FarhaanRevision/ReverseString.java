package FarhaanRevision;

public class ReverseString {
	public static void main(String [] args) {
		
		String s = " vinit";
		char ch[] = s.toCharArray()////this converst given string into each bolck of charaarray like v i n i t 
;
		for( int i = ch.length-1; i>=0; i--)////count starts from end to print   " t i n i v" 
		{
			
			System.out.println(ch[i]);
			
		}
	}
}
