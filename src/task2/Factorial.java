package task2;

public class Factorial {

    private int factorial;
    private int n;

    public Factorial(int factorial){
        this.factorial = factorial;
        findN();
    }

    private void findN(){
        int n = 1;
        int tempFactorial = 1;

        while (tempFactorial < factorial){
            n++;
            tempFactorial = tempFactorial * n;
        }

        if (tempFactorial == factorial){
            System.out.println(n + "! = " + factorial);
        } else {
            System.out.println("Integer number of n does not exist");
            System.out.println("Try again");
        }

    }
}
