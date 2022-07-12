package gfg.mathematics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int a = 2;
		a = sc.nextInt();
		sc.close();
		System.err.println("Number is Prime by naive method : " + isPrimeNaive(a));
		System.err.println("Number is Prime by optimized method : " + isPrimeOptimized(a));
	}

	static Boolean isPrimeNaive(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static Boolean isPrimeOptimized(int n) {
		if (n == 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static Boolean isPrimeEfficient(int n) {
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

}
