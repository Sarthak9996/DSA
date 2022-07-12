package gfg.mathematics;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int a = 2;
		a = sc.nextInt();
		sc.close();
		primeFactorsbyNaive(a);
		primeFactorbyEfficient(a);
		primeFactorbyMoreEfficient(a);
	}

	static void primeFactorsbyNaive(int n) {
		System.err.println("Prime Factors by naive method are : ");
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				int x = i;
				while (n % x == 0) {
					System.err.println(i);
					x = x * i;
				}
			}
		}
	}

	static Boolean isPrime(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static void primeFactorbyEfficient(int n) {

		System.err.println("Prime Factors by efficient method are : ");
		if (n == 1)
			return;
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				System.err.println(i);
				n = n / i;
			}
		}
		if (n > 1)
			System.err.println(n);
	}

	static void primeFactorbyMoreEfficient(int n) {
		System.err.println("Prime Factors by efficient method are : ");
		if (n <= 1)
			return;
		while (n % 2 == 0) {
			System.err.println(2);
			n = n / 2;
		}
		while (n % 3 == 0) {
			System.err.println(3);
			n = n / 3;
		}
		for (int i = 5; i * i <= n; i = i + 6) {
			while (n % i == 0) {
				System.err.println(i);
				n = n / i;
			}
			while (n % (i + 2) == 0) {
				System.err.println(i + 2);
				n = n / (i + 2);
			}
		}
		if (n > 3)
			System.err.println(n);
	}

}
