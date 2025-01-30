package java1404;

public class Reverse_String {
	public static void main(String [] args) {
		String s = " kumar";
		String sarr[] = s.split("");
		for( int i = sarr.length-1;i>=0;i--)
		{
			System.out.println(sarr[i]);
			
		}
	}

}
