import java.util.Scanner;

public class Exponent {
	//class that creates objects
	private int n;
	private int power;
	public Exponent(int n, int power) {
		this.n = n;
		this.power = power;
	}


	//method that calls itself
	public static int exponent(int n, int power) {
		if (n == 0) {
			return 0;
		}
		else if (power == 0) {
			return 1;
		}
		else {
			return (n * exponent(n, power - 1));
		}


	}
	public int exponent() {
		if (n == 0) {
			return 0;
		}
		else if (power == 0) {
			return 1;
		}
		else {
			return (n * exponent(n, power - 1));
		}
	}

	public static void main(String[] args) {
		/*
		Exponent exponent = new Exponent(2, 3);
		System.out.println(exponent.exponent());
		*/

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scanner.nextInt();
		System.out.print("Enter a power: ");
		int power = scanner.nextInt();
		//System.out.println(exponent(n, power));
		
		

		//iteratively
		
		int answer = 1;
		for (int i = 1; i <= power; i++) {
			if (power == 0) {
				break;
			}
			answer *= n;
		}
		if (n == 0) {
			answer = 0;
		}
		System.out.println(answer);
		
	}
}