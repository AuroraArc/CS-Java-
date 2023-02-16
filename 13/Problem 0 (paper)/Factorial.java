import java.util.Scanner;

public class Factorial {
    //class that creates objects
    private int n;
    public Factorial(int n) {
        this.n = n;
    }

    public int factorial() {
        if (n == 0) {
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }

    //method that calls itself
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return (n * factorial(n - 1));
        }
    }
    public static void main(String[] args) {
        Factorial factorial = new Factorial(3);
        System.out.println(factorial.factorial());

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        */

        //factorial using class that calls itself
        //System.out.println(factorial(number));

        //factorial iteratively
        /*
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println(number + "! is " + factorial);
         */
    }
}