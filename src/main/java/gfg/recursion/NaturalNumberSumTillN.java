package gfg.recursion;

import java.util.Scanner;

public class NaturalNumberSumTillN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number n");
		int n = 1;
		n = sc.nextInt();

		System.err.println("Sum by recursion : " + sumNaturalRecursion(n));

		System.err.println("Sum by formula : " + sumNaturalByFormula(n));
	}

	static Integer sumNaturalRecursion(int n) {
		if (n == 0)
			return 0;
		return n + sumNaturalRecursion(n - 1);
	}

	static Integer sumNaturalByFormula(int n) {
		return (n * (n + 1)) / 2;
	}
}
