import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime (int primeCheck) {
        for (int k = 2; k < primeCheck; k++) {
            if (primeCheck % k == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = input.nextInt();
        for (int j = 2; j <= i; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }
}
