import java.io.File;
import java.io.FileReader;

public class Exception {
	
	public static void main(String [] args){
		
		File f_ref= new File("C:\\User\\user\\Desktop\\Sample.txt");
		
		try {
			
			FileReader fr = new FileReader(f_ref);
			
	}catch(Exception e) {
		
		System.out.println(e);
	}
		
	}

}
