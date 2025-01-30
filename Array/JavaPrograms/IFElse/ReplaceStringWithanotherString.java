package JavaPrograms.IFElse;

public class ReplaceStringWithanotherString {
    public static void main(String args[]) {
        String s1 = "My name is Rajendra. My name is Lamror. My name is Vinit";
        String replacedString = s1.replaceAll("Lamror", "was");
        System.out.println(replacedString);
    }
}
