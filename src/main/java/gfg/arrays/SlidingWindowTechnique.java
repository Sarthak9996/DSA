package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SlidingWindowTechnique {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the size of window k : ");
		int k = 1;
		k = sc.nextInt();

		sc.close();

		System.err.println(
				"Maximum Sum of " + k + " consecutive integers by naive method : " + slidingWindowNaive(ar, k));
		System.err.println(
				"Maximum Sum of " + k + " consecutive integers by efficient method : " + slidingWindowEfficient(ar, k));
	}

	static Integer slidingWindowNaive(ArrayList<Integer> ar, int k) {
		int max_sum = 0;
		for (int i = 0; i + k - 1 < ar.size(); i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += ar.get(i + j);
				max_sum = Math.max(max_sum, sum);
			}
		}
		return max_sum;
	}

	static Integer slidingWindowEfficient(ArrayList<Integer> ar, int k) {
		int curr_sum = 0;
		for (int i = 0; i < k; i++) {
			curr_sum += ar.get(i);
		}
		int max_sum = curr_sum;
		for (int i = k; i < ar.size(); i++) {
			curr_sum += ar.get(i) - ar.get(i - k);
			max_sum = Math.max(max_sum, curr_sum);
		}
		return max_sum;
	}
}
