package gfg.mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int a = 3;
		a = sc.nextInt();
		printPrimes(a);
		sieve(a);
	}

	static void printPrimes(int n) {
		System.err.println("Prime Numbers : ");
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.err.print(i + " ");
			}
		}
	}

	static Boolean isPrime(int n) {
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	}

	static void sieve(int n) {
		System.err.println("\nPrime Numbers : ");

		if (n <= 1)
			return;

		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		for (int i = 2; i * i <= n; i++) {
			if (isPrime[i]) {
				for (int j = 2 * i; j <= n; j = j + i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 2; i <= n; i++) {
			if (isPrime[i])
				System.err.print(i + " ");
		}
	}
}
