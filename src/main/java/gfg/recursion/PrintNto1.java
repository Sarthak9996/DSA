package gfg.recursion;

import java.util.Scanner;

public class PrintNto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int n = 1;
		n = sc.nextInt();
		sc.close();
		System.err.println("Numbers are : ");
		print(n);
	}

	static void print(int n) {
		if (n == 0)
			return;
		System.err.print(n + " ");
		print(n - 1);
	}

}
