package gfg.matrix;

import java.util.Scanner;

public class SnakePatternInMatrix {
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
		snakePattern(ar, r, c);
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

	static void snakePattern(Integer[][] ar, int row, int column) {
		System.err.println("Matrix in snake pattern");
		for (int i = 0; i < row; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < column; j++) {
					System.err.print(ar[i][j] + " ");
				}
			} else {
				for (int j = column - 1; j >= 0; j--) {
					System.err.print(ar[i][j] + " ");
				}
			}
		}
	}
}
