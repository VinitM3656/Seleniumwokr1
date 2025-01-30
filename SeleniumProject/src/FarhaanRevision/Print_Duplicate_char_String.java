package FarhaanRevision;

public class Print_Duplicate_char_String {
	
	//public class Print_Duplicate_char_String {
		
		public static void main(String[] args) {
			String s = "kumaeka";
			 
			for (int i = 0; i < s.length(); i++) {
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						System.out.print(s.charAt(i));
						break; // To avoid printing the same character multiple times
					}
				}
			}
		}
	}
