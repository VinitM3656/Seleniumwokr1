package JavaPrograms.IFElse;

import java.util.Scanner;

public class FloydofTrangle {
    public static void main(String args[]) {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of Floyd triangle you want:");
        n = in.nextInt();
        System.out.println("Floyd triangle:-");
        for (c = 1; c <= n; c++) {
            for (d = 1; d <= c; d++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

