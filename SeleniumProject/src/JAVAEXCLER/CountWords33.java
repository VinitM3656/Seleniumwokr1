package JAVAEXCLER;

public class CountWords33 {
	
	public static void main(String [] args) {
		 
		String words = " one two three four five six";
		int countwords =  words.split("\\s").length;//"\\s"  which is a regular expression representing any 
		                                                    //whitespace character (such as space, tab, or newline)
		System.out.println(countwords);
		
	}

}
