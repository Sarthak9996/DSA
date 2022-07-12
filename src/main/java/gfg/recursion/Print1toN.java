package gfg.recursion;

import java.util.Scanner;

public class Print1toN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number");
		int n = 1;
		n = sc.nextInt();
		sc.close();
		System.err.println("The numbers by my way are ");
		printMyWay(n, 1);
		System.err.println("\nThe numbers are ");
		print(n);

	}
	
	//Also this function will be faster as it is a tail recursive function
	static void printMyWay(int n, int i) {
		if (i > n)
			return;
		System.err.print(i + " ");
		printMyWay(n, i + 1);
	}

	static void print(int n) {
		if (n == 0)
			return;
		print(n - 1);
		System.err.print(n + " ");
	}

}
