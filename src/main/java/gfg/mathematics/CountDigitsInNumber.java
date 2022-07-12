package gfg.mathematics;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number ");
		int n = 10;
		n = sc.nextInt();
		sc.close();
		System.err.println("Number of digits in the number by Iteration method : " + countDigits(n));
		System.err.println("Number of digits in the number by String method : " + countDigitsByString(n));
		System.err.println("Number of digits in the number by Recursion method : " + countDigitsByRecursion(n));

	}

	static Integer countDigits(int n) {
		int result = 0;
		while (n != 0) {
			n = n / 10;
			result++;
		}
		return result;
	}

	static Integer countDigitsByString(int n) {
		String s = n + "";
		return s.length();
	}

	static Integer countDigitsByRecursion(int n) {
		if(n==0) {
			return 0;
		}
		return 1 + countDigitsByRecursion(n/10);
	}

}
