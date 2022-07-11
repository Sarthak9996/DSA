package gfg.mathematics;

import java.util.Scanner;

public class GCDorHCF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the first number : ");
		int a = 1;
		a = sc.nextInt();
		System.err.println("Enter the second number : ");
		int b = 1;
		b = sc.nextInt();

		System.err.println("GCD or HCF by naive method taking minimum and doing -- and % : " + hcf(a, b));
		System.err.println("GCD or HCF by euclid : " + hcfByEuclid(a, b));
		System.err.println("GCD or HCF by euclid : " + hcfByOptimisedEuclid(a, b));

	}

	static Integer hcf(int a, int b) {
		int result = Math.min(a, b);
		while (result > 0) {
			if (a % result == 0 && b % result == 0) {
				break;
			}
			result--;
		}
		return result;
	}

	static Integer hcfByEuclid(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	static Integer hcfByOptimisedEuclid(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return hcfByOptimisedEuclid(b, a % b);
		}
	}
}
