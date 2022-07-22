package gfg.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSubsequence {
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

		System.err.println("Longest Consecutive Subsequence : " + longestConsecutiveSubsequence(ar));
	}

	static Integer longestConsecutiveSubsequence(ArrayList<Integer> ar) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer i : ar) {
			set.add(i);
		}
		int result = 1;
		for (Integer x : set) {
			if (!set.contains(x - 1)) {
				int curr = 1;
				while (set.contains(x + curr)) {
					curr++;
				}
				result = Math.max(result, curr);
			}
		}
		return result;
	}
}
