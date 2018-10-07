package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of squares:");
            int n = in.nextInt();

            if (n >= 1 && n <= Math.pow(10, 9)) {
                System.out.print("n = " + n);
                new Matches(n);
            } else {
                System.out.println("The number of squares shut be in range 1 <= n <= 10^9");
            }

            System.out.println();
        }
    }
}
