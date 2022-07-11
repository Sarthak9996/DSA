package gfg.mathematics;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the first number");
		int a = 1;
		a = sc.nextInt();
		System.err.println("Enter the second number");
		int b = 1;
		b = sc.nextInt();

		System.err.println("LCM by naive method : " + lcmNaive(a, b));
		System.err.println("LCM by hcf method : " + ((a * b) / hcf(a, b)));

	}

	static Integer hcf(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	static Integer lcmNaive(int a, int b) {
		int result = Math.max(a, b);
		while (true) {
			if (result % a == 0 && result % b == 0) {
				return result;
			}
			result++;
		}
	}
}
