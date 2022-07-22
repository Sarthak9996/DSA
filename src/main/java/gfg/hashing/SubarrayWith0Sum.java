package gfg.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubarrayWith0Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Subarray with 0 sum is present : " + isSubarrayWith0Sum(ar));
	}

	static Boolean isSubarrayWith0Sum(ArrayList<Integer> ar) {
		Set<Integer> set = new HashSet<Integer>();
		int prefixSum = 0;
		for (Integer i : ar) {
			prefixSum += i;
			if (set.contains(prefixSum))
				return Boolean.TRUE;
			if (prefixSum == 0)
				return Boolean.TRUE;
			set.add(prefixSum);
		}
		return Boolean.FALSE;
	}
}
