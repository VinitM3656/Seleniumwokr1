package InterviewQ2;

public class RemoveSpaceBar {
	public static void main(String [] args) {
		String  s = " Kumar Saliivat";
		for(char a:s.toCharArray()) {
			if(a!=' ') {
				System.out.println(a);
			}
		}
		
	}

}
