package java1404;

public class FileH1 {
	public static <fileOutputStream> void main(String [] args) {
		fileOutputStream f1 = new fileOutputStream("demo.txt",true);
		
		String s1 = " collenge road Nashik";
		char ch[] = s1.toCharArray();
		int i ;
		for( i=0; i<s1.length();i++) {
			((Object) f1).write(ch[i]);
			
		}
		f1.clone();
	}

}
