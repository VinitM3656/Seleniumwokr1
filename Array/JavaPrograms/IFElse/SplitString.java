package JavaPrograms.IFElse;

public class SplitString {
	public static void main(String args[]) {
		String s1 = "java string split method by Technolamror";
		String[] words=s1.split("\\s");
		for(String w:words) {
			System.out.println(w);
		
		}
	}
	

}
