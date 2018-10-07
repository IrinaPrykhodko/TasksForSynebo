package task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.print("Enter the value of factorial: ");
            int factorial = in.nextInt();

            if (factorial >= 1 && factorial <=2000){
                new Factorial(factorial);
            } else {
                System.out.println("The value of factorial shut be in range 1 <= n <= 2000");
            }

            System.out.println();
        }

    }

}
