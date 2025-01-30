

package JavaPrograms;

public class ThorwEception {
    static void validate(int age) {
        if (age < 18)
            throw new IllegalArgumentException("not valid");
        else
            System.out.println("Welcome to vote on Technolamror");
    }

    public static void main(String args[]) {
        try {
            validate(13);
            System.out.println("Rest of the code...");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}
