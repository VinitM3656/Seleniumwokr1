package java1404;

public class NumberAndCharacter {
	
	public static void main(String [] args) {
		String s = " kumar123   h**";
		int Uppercase=0;
		int Lowercase= 0;
		int Number = 0;
		int space= 0;
		int other = 0;
		for( char c:s.toCharArray()) {
			if(Character.isUpperCase(c)) {
				Uppercase++;
			}
			
			else if(Character.isLowerCase(c)) {
				Lowercase++;
				
				
			}
			else if( Character.isDigit(c)) {
				Number++;
				
			}
			else if(Character.isSpaceChar(c)) {
				space++;
				
			}
			
			else {
				other++;
				
			}
			System.out.println(Uppercase);
			System.out.println(Lowercase);
			System.out.println(Number);
			System.out.println(other);
			System.out.println(space);
			
		}
	}

}
