package InterviewQ2;

public class vowel {
	
	public static void main(String [] args) {
		String str = " a hi welcomea";
		for( int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='o')
System.out.println("Given string contains"+ str.charAt(i)+" at the index"+i);
		
					
		}
	}

}
