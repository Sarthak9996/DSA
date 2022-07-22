package gfg.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithEqual0s1s {
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

		System.err.println("Length of longest subarray : " + lengthOfLongestSubarray(ar));
	}

	static Integer lengthOfLongestSubarray(ArrayList<Integer> ar) {
		for (int i = 0; i < ar.size(); i++) {
			ar.set(i, ar.get(i) == 0 ? -1 : 1);
		}
		System.err.println(ar.toString());
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int prefixSum = 0, result = 0;
		for (int i = 0; i < ar.size(); i++) {
			prefixSum += ar.get(i);

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
