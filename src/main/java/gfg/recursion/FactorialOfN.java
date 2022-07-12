package gfg.recursion;

import java.util.Scanner;

public class FactorialOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number");
		int n = 1;
		n = sc.nextInt();
		sc.close();
		System.err.println("Factorial is " + factorial(n));
	}

	static Integer factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

}
