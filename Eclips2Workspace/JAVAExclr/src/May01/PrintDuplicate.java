package May01;

public class PrintDuplicate {
    public static void main(String[] args) {
        String s = "kumarka";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) { // Added missing type declaration for j
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println(s.charAt(i));
                    break; // Added break statement to avoid printing duplicate characters multiple times
                }
            }
        }
    }
}
