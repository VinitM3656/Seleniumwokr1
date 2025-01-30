package InterviewQuestions;


	
import java.util.Arrays;

public class StoreDifferentDataTypes {
    public static void main(String[] args) {
        Object[] a = new Object[4];
        a[0] = 5;
        a[1] = true; // Removed unnecessary whitespace and quotation marks
        a[2] = 23.23;
        a[3] = true;
        System.out.println(Arrays.toString(a));
    }
}

