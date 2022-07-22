package gfg.matrix;

import java.util.Scanner;

public class TransposeMatrix {
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
		System.err.println("The Matrix is : ");
		printNormalMatrix(ar, r, c);
		transpose(ar, r, c);
	}

	static void printNormalMatrix(Integer[][] ar, int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.err.print(ar[i][j] + " ");
			}
			System.err.println();
		}
		System.err.println();
	}

	static void transpose(Integer[][] a, int r, int c) {
		Integer[][] ar = a;
		for (int i = 0; i < r; i++) {
			for (int j = i + 1; j < c; j++) {
				int temp = ar[i][j];
				ar[i][j] = ar[j][i];
				ar[j][i] = temp;
			}
		}
		System.err.println("Matrix after transpose is : ");
		printNormalMatrix(ar, r, c);
	}
}
