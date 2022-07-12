package gfg.mathematics;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int n = 0;
		n = sc.nextInt();
		sc.close();
		System.err.println("Factorial by iteration method : " + factorialByLoop(n));
		System.err.println("Factorial by recursion method : " + factorialByRecursion(n));
	}

	static Integer factorialByLoop(int n) {
		int result = 1;
		if (n == 0)
			return result;
		while (n > 0) {
			result = result * n;
			n--;
		}
		return result;
	}

	static Integer factorialByRecursion(int n) {
		if (n == 0)
			return 1;
		return n * factorialByRecursion(n - 1);
	}
}
