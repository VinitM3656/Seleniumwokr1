package InterviewQuestions;

public class Remove_space_without_RemoveMethod {
	public static void main(String [] args) {
		
		String s= " vinit Bhimashakar";
		for(char a:s.toCharArray()) {
			if(a!=' ') {
				System.out.print(a);

			}
		}
		}
}
