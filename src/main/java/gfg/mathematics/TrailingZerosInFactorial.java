package gfg.mathematics;

import java.util.Scanner;

public class TrailingZerosInFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number : ");
		int n = 5;
		n = sc.nextInt();
		int factorial = factorialOfNumber(n);
		System.err.println("Number of zeros by dividing by 10 method : " + countZerosBy10Method(factorial));
		System.err.println("Number of zeros by dividing by 5 method : " + countZerosBy5Method(n));

	}

	static Integer factorialOfNumber(int n) {
		int result = 1;
		if (n == 0)
			return result;
		while (n > 0) {
			result = result * n;
			n--;
		}
		return result;
	}

	static Integer countZerosBy10Method(int n) {
		int result = 0;
		while (n % 10 == 0) {
			result++;
			n = n / 10;
		}
		return result;
	}

	static Integer countZerosBy5Method(int n) {
		int result = 0;
		for (int i = 5; i <= n; i = i + 5) {
			result = result + n / i;
		}
		return result;
	}
}
