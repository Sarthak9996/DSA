package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumCircularSumSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Maximum Circular Sum by naive method is : " + circularSumNaive(ar));
	}

	static Integer circularSumNaive(ArrayList<Integer> ar) {
		int result = ar.get(0);
		for (int i = 0; i < ar.size(); i++) {
			int curr_max = ar.get(i);
			int curr_sum = ar.get(i);
			for (int j = 1; j < ar.size(); j++) {
				int index = (i + j) % ar.size();
				curr_sum += ar.get(index);
				curr_max = Math.max(curr_max, curr_sum);
			}
			result = Math.max(curr_max, result);
		}
		return result;
	}

	static Integer circularEfficient(ArrayList<Integer> ar) {
		// TODO
		return null;
	}
}
