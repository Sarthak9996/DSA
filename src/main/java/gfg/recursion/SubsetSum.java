package gfg.recursion;

import java.util.Scanner;

public class SubsetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the size of array");
		int n = 0;
		n = sc.nextInt();

		int[] arr = new int[n];
		System.err.println("Enter the elements of the array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.err.println("Enter the sum");
		int sum = 0;
		sum = sc.nextInt();

		sc.close();

		System.err.println("Subsets available " + countSubsets(arr, n, sum));
	}

	static Integer countSubsets(int[] ar, int n, int sum) {
		if (n == 0)
			return (sum == 0 ? 1 : 0);

		return countSubsets(ar, n - 1, sum) + countSubsets(ar, n-1, (sum - ar[n - 1]));
	}

}
