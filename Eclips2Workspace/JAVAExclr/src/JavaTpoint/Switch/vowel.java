package JavaTpoint.Switch;

public class vowel {
	
	public static void main(String[] args) {
		char ch = 'O'; // corrected the initialization of 'ch', using single quotes for char literals
		
		switch(ch) {
			case 'a':
				System.out.println("It's a vowel");
				break;
			case 'e': // added missing cases for 'e' and 'u'
				System.out.println("It's a vowel");
				break;
			case 'i':
				System.out.println("It's a vowel");
				break;
			case 'o':
				System.out.println("It's a vowel");
				break;
			case 'u':
				System.out.println("It's a vowel");
				break;
			default: // added a default case to handle characters other than vowels
				System.out.println("It's not a vowel");
		}
	}
}
