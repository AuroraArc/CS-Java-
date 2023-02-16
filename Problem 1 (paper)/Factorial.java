import java.util.Scanner;

public class Factorial {
	public static int factorial(int n) {
		return factorialHelper(n, 1);
	}

	public static int factorialHelper(int n, int answer) {
		if (n == 0) {
			return answer;
		}
		else {
			return factorialHelper(n - 1, answer * n);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		System.out.println(factorial(number));
	}
}