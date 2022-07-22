package gfg.matrix;

import java.util.Scanner;

public class BoundaryElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of rows in the matrix");
		int r = sc.nextInt();

		System.err.println("Enter the number of columns in the matrix");
		int c = sc.nextInt();

		Integer[][] ar = new Integer[r][c];
		System.err.println("Enter the elements of the matrix");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.err.print("Enter element at [" + i + "," + j + "] : ");
				ar[i][j] = sc.nextInt();
			}
		}

		sc.close();

		printNormalMatrix(ar, r, c);

		boundaryElements(ar, r, c);
	}

	static void printNormalMatrix(Integer[][] ar, int r, int c) {
		System.err.println("The Matrix is : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.err.print(ar[i][j] + " ");
			}
			System.err.println();
		}
		System.err.println();
	}

	static void boundaryElements(Integer[][] ar, int r, int c) {
		System.err.print("Boundary Elements are : ");
		if (r == 1) {
			for (int i = 0; i < c; i++) {
				System.err.print(ar[0][i] + " ");
			}
		}
		if (c == 1) {
			for (int i = 0; i < r; i++) {
				System.err.print(ar[i][c - 1] + " ");
			}
		} else {
			for (int i = 0; i < c; i++) {
				System.err.print(ar[0][i] + " ");
			}
			for (int i = 1; i < r; i++) {
				System.err.print(ar[i][c - 1] + " ");
			}
			for (int i = c - 2; i >= 0; i--) {
				System.err.print(ar[r - 1][i] + " ");
			}
			for (int i = r - 2; i >= 1; i--) {
				System.err.print(ar[i][0] + " ");
			}
		}
	}
}
