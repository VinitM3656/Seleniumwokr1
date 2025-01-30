package InterviewQuestions;

public class Occurrence_Given_Cha {
	public static void main(String [] args) {
		String s = " java is java again java again";
		char ch = 'a';
		int count=s.length()-s.replace(" a","").length();
		System.out.println(" number of ocurance of 'a' in "+s+"="+count);
		
		
	
	}

}
