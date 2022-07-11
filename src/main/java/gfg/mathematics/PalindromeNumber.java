package gfg.mathematics;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number : ");
		int n = 101;
		n = sc.nextInt();

		int rev = 0;
		rev = reverseOfNumber(n);
		if (rev == n) {
			System.err.println("Number is palindrome!!");
		}else {
			System.err.println("Number is not palindrome!!");
		}
	}

	static Integer reverseOfNumber(int n) {
		int result = 0;
		while (n != 0) {
			int rem = n % 10;
			result = result * 10 + rem;
			n /= 10;
		}
		return result;
	}
}
