package gfg.recursion;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int n = 1;
		n = sc.nextInt();
		sc.close();
		System.err.println("Nth fibonacci number is " + fibonacci(n));
	}

	static Integer fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
