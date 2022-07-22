package gfg.matrix;

import java.util.Scanner;

public class RotateAntiClockwise90 {
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
		reverse(ar, r, c);
	}

	static void reverse(Integer[][] a, int r, int c) {
		transpose(a, r, c);

		for (int i = 0; i < r; i++) {
			int low = 0, high = r - 1;
			while (low < high) {
				int temp = a[low][i];
				a[low][i] = a[high][i];
				a[high][i] = temp;
				low++;
				high--;
			}
		}
		System.err.println("Rotated Array is : ");
		printNormalMatrix(a, r, c);
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
	}
}
