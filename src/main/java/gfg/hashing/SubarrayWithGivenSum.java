package gfg.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarrayWithGivenSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}
		System.err.println("Enter the sum");
		int sum = sc.nextInt();

		sc.close();

		System.err.println("Pair for the given sum is available : " + isSubarrayWithGivenSum(ar, sum));

	}

	static Boolean isSubarrayWithGivenSum(ArrayList<Integer> ar, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		int prefixSum = 0;
		for (Integer i : ar) {
			prefixSum += i;
			if (prefixSum == sum)
				return Boolean.TRUE;
			if (set.contains(prefixSum - sum))
				return Boolean.TRUE;
			set.add(prefixSum);
		}
		return Boolean.FALSE;
	}
}
