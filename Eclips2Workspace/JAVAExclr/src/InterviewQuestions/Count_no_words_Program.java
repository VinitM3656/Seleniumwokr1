package InterviewQuestions;
import java.util.Scanner;

public class Count_no_words_Program {
    public static void main(String [] args) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        int count = 0;
        if (!s.isEmpty()) {
            count = 1;
            for(int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
                    count++;
                }
            }
        }
        System.out.println("Number of words in the string: " + count);
    } 
}
