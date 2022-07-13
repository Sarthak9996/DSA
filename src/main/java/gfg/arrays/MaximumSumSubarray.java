package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSumSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the size of the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Maximum sum of subarray is : " + maxSumSubarrayNaive(ar));
	}

	static Integer maxSumSubarrayNaive(ArrayList<Integer> ar) {
		int result = ar.get(0);
		int maxEnding = ar.get(0);
		for (int i = 0; i < ar.size(); i++) {
			maxEnding = Math.max(maxEnding + ar.get(i), ar.get(i));
			result = Math.max(result, maxEnding);
		}
		return result;
	}
}
