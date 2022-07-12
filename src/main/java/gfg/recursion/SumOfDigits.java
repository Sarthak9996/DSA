package gfg.recursion;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int n = 0;
		n = sc.nextInt();
		sc.close();

		System.err.println("Sum of the digits is : " + getSum(n));
	}

	static Integer getSum(int n) {
		if (n == 0)
			return 0;
		return n % 10 + getSum(n / 10);
	}
}
