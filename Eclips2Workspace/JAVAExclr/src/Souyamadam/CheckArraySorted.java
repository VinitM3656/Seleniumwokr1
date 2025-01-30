package Souyamadam;

public class CheckArraySorted {
    public static void main(String[] args) {
        String s = "vinit"; // Note: Removed space at the beginning for better palindrome testing
        
        StringBuffer s2 = new StringBuffer(s);
        s2.reverse(); // Corrected to store the reversed string
        if (s.equals(s2.toString())) { // Compare the original string with the reversed string
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}
