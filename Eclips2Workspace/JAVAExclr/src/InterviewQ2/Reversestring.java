package InterviewQ2;


public class Reversestring {
public static void main(String [] args) {
	String str = " vinit";
	char ch []= str.toCharArray();
	for(int i = ch.length-1;i>=0;i--) {
		System.out.println(ch[i]);
	}
	}
}