package May01;

public class Vowel {
    public static void main(String[] args) {
        String str = "hii hello how are you beautyful i am okey withit";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' ||
                str.charAt(i) == 'u' || str.charAt(i) == 'i') {
                System.out.println("Given string contains vowel " + str.charAt(i) + " at index " + i);
            }
        }
    }
}
