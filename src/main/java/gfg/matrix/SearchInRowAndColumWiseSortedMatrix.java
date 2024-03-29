package gfg.matrix;

import java.util.Scanner;

public class SearchInRowAndColumWiseSortedMatrix {
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

		System.err.println("Enter the element to be searched : ");
		int elem = sc.nextInt();

		sc.close();

		System.err.println("The Matrix is : ");

		printNormalMatrix(ar, r, c);
		searchElement(ar, r, c, elem);
	}

	static void searchElement(Integer[][] ar, int r, int c, int num) {
		int i = 0, j = c - 1;
		while (i < r && j >= 0) {
			if (ar[i][j] == num) {
				System.err.println("Element found at [" + i + "," + j + "]");
				return;
			} else if (ar[i][j] > num) {
				j--;
			} else {
				i++;
			}
		}
		System.err.println("Element not found!!");
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

	public boolean searchMatrix(int[][] matrix, int target) {
		int r = matrix.length, c = matrix[0].length;

		int i = 0, j = c - 1;

		while (i < r && j >= 0) {
			if (matrix[i][j] == target)
				return true;
			else if (matrix[i][j] > target)
				j--;
			else
				i++;
		}

		return false;
	}

	public boolean searchMatrixBinary(int[][] matrix, int target) {
		if (matrix.length == 0)
			return false;

		int r = matrix.length;
		int c = matrix[0].length;

		int i = 0;
		int j = r * c - 1;

		while (i <= j) {
			int mid = (i + (j - i)) / 2;

			if (matrix[mid / c][mid % c] == target) {
				return true;
			}
			if (matrix[mid / c][mid % c] < target) {
				i = mid + 1;
			} else {
				j = mid - 1;
			}
		}
		return false;
	}
}
