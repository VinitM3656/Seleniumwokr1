package May01;

import java.io.File;
import java.io.IOException;

public class FileH {
	public static void main(String [] args) throws IOException {
		
		File f1 = new File("demo.txt");
		f1.createNewFile();
		System.out.println(f1.canWrite());
		System.out.println(f1.exists());
		System.out.println(f1.getName());
		System.out.println(f1.length());
		
	}

}
