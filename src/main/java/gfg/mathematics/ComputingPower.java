package gfg.mathematics;

import java.util.Scanner;

public class ComputingPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number ");
		int x = 1;
		x = sc.nextInt();
		System.err.println("Enter the power ");
		int n = 1;
		n = sc.nextInt();
		sc.close();
		System.err.println("Computed Power with naive method : " + powerNaive(x, n));
		System.err.println("Computed Power with efficient method : " + powerEfficient(x, n));

	}

	static Integer powerNaive(int x, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result = result * x;
		}
		return result;
	}

	static Integer powerEfficient(int x, int n) {
		if (n == 0)
			return 1;
		int temp = powerEfficient(x, n / 2);
		temp *= temp;

		if (n % 2 == 0)
			return temp;
		else
			return (temp * x);
	}

}
