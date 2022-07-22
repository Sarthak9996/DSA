package gfg.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestCommonSpanWithSameSumInBinaryArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the first array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the elements of the second array");
		ArrayList<Integer> ar1 = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar1.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Longest Span is : " + longestCommonSpan(ar, ar1));
	}

	static Integer longestCommonSpan(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> temp = new ArrayList<Integer>(a.size());

		for (int i = 0; i < a.size(); i++) {
			temp.add(a.get(i) - b.get(i));
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int prefixSum = 0, result = 0;
		for (int i = 0; i < temp.size(); i++) {
			prefixSum += temp.get(i);
			if (prefixSum == 0) {
				result = i + 1;
			}
			if (map.containsKey(prefixSum)) {
				result = Math.max(result, i - map.get(prefixSum));
			} else {
				map.put(prefixSum, i);
			}
		}
		return result;
	}
}
