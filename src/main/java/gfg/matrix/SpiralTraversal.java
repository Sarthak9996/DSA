package gfg.matrix;

import java.util.Scanner;

public class SpiralTraversal {
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

		spiralTraversal(ar, r, c);
	}

	static void spiralTraversal(Integer[][] ar, int r, int c) {
		System.err.print("Spiral Traversal is : ");

		int top = 0, right = c - 1, bottom = r - 1, left = 0;

		while (top <= bottom && left <= right) {
			// Top row var: top
			for (int i = left; i <= right; i++) {
				System.err.print(ar[top][i] + " ");
			}
			top++;
			// Right column var: right
			for (int i = top; i <= bottom; i++) {
				System.err.print(ar[i][right] + " ");
			}
			right--;
			// Bottom row var : bottom
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					System.err.print(ar[bottom][i] + " ");
				}
				bottom--;
			}
//			for (int i = right; i >= left; i--) {
//				System.err.print(ar[bottom][i] + " ");
//			}
			bottom--;
			// Left Column var : left
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					System.err.print(ar[i][left] + " ");
				}
				left++;
			}
//			for (int i = bottom; i >= top; i--) {
//				System.err.print(ar[i][left] + " ");
//			}
			left++;
		}
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
}
