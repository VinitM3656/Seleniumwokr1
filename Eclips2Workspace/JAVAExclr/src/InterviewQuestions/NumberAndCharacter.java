package InterviewQuestions;

public class NumberAndCharacter {
	public static void main(String [] args) {
		String s = "Vinit Mhetre";
		int Uppercase=0;
		int Lowercase= 0;
		int num= 0;
		int space = 0;
		int other = 0;
		for( char c : s.toCharArray()) {
			if( Character.isUpperCase(c)) {
				Uppercase++;
				
			}else if(Character.isLowerCase(c)) {
				Lowercase++;
				
			}else if( Character.isDigit(c)) {
				num++;
				
			}else if( Character.isSpace(c)) {
				space++;
				
			}else {
				other  ++;
				
			}
			System.out.println(Uppercase);
			System.out.println(Lowercase);
			System.out.println(num);
			System.out.println(other);
			System.out.println(space);
		}
	}

}
