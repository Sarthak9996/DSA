package gfg.mathematics;

import java.util.Scanner;

public class ComputingPowerInIteration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int x = 1;
		x = sc.nextInt();
		System.err.println("Enter the power");
		int n = 1;
		n = sc.nextInt();
		
		System.err.println("Value by using the iterative method : " + power(x, n));
	}

	static Integer power(int x, int n) {
		int result = 1;
		while (n > 0) {
			if (n % 2 != 0)
				result *= x;
			x *= x;
			n /= 2;
		}
		return result;
	}

}
