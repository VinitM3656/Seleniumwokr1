package May01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileH4 {
	public static void main(String [] args) throws IOException {
		FileReader fR1= new FileReader(" gunjan.txt");
		BufferedReader b1 = new BufferedReader(fR1);
		
		
		char a1[] = new char[56];
		b1.read(a1,3,4);
		System.out.println(a1);
		
	}

}
