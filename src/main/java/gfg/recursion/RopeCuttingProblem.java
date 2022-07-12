package gfg.recursion;

import java.util.Scanner;

public class RopeCuttingProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the total length");
		int n = sc.nextInt();
		System.err.println("Enter the length of rope a");
		int a = sc.nextInt();
		System.err.println("Enter the length of rope b");
		int b = sc.nextInt();
		System.err.println("Enter the length of rope c");
		int c = sc.nextInt();

		sc.close();

		System.err.println("Max Pieces available " + maxPieces(n, a, b, c));
	}

	static Integer maxPieces(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		if (n < 0)
			return -1;
		int result = Math.max(maxPieces(n - a, a, b, c),
				Math.max(maxPieces(n - b, a, b, c), maxPieces(n - c, a, b, c)));

		if (result == -1) {
			return -1;
		}
		return result + 1;
	}

}
