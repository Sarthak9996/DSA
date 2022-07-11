package gfg.mathematics;

import java.util.Scanner;

public class AllDivisorsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number ");
		int a = 1;
		a = sc.nextInt();
		printDivisorsNaive(a);
		printDivisorsNoOrder(a);
		printDivisorInOrder(a);

	}

	static void printDivisorsNaive(int n) {
		System.err.println("Divisors of the number by naive method are : ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.err.println(i);
		}
	}

	static void printDivisorsNoOrder(int n) {
		System.err.println("Divisors of the number by optimized method but not in order are : ");
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.err.println(i);
				if (i != (n / i))
					System.err.println(n / i);
			}
		}
	}

	static void printDivisorInOrder(int n) {
		System.err.println("Divisors of the number by optimized method and in order are : ");
		int i;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.err.println(i);
			}
		}
		for (; i >= 2; i--) {
			if (n % i == 0)
				System.err.println(n / i);
		}
	}

}
