package FarhaanRevision;

class PrimeNo {
    public static void main(String[] args) {
        int no = 7; // Value is not obtained from user input, it's predefined

        int temp = 0;

        for (int i = 2; i <= no - 1; i++) {         //{//i = 2,3,4,5,6}
            if (no % i == 0) {
                temp = temp + 1;
            }
            if (temp == 0) {
                System.out.println(" it's prime number");
            } else {
                System.out.println(" it's not fucking prime num");
            }
        }
    }
}

	