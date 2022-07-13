package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumDifference {
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
		sc.close();

		System.err.println("Maximum Difference by naive method is : " + maxDiffNaive(ar));
		System.err.println("Maximum Difference by efficient method is : " + maxDiffEfficient(ar));
	}

	static Integer maxDiffNaive(ArrayList<Integer> ar) {
		int result = ar.get(1) - ar.get(0);
		for (int i = 0; i < ar.size() - 1; i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				result = Math.max(result, ar.get(j) - ar.get(i));
			}
		}
		return result;
	}

	static Integer maxDiffEfficient(ArrayList<Integer> ar) {
		int result = ar.get(1) - ar.get(0), minValue = ar.get(0);
		for (int i = 1; i < ar.size(); i++) {
			result = Math.max(result, ar.get(i) - minValue);
			minValue = Math.min(minValue, ar.get(i));
		}

		return result;
	}
}
