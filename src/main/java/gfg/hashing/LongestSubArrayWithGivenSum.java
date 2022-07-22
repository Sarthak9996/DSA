package gfg.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithGivenSum {

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

		System.err.println("Length of longest subarray with given sum : " + lengthOfLongestSubArray(ar, sum));
	}

	static Integer lengthOfLongestSubArray(ArrayList<Integer> ar, int sum) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int prefixSum = 0, result = 0;
		for (int i = 0; i < ar.size(); i++) {
			prefixSum += ar.get(i);

			if (prefixSum == sum) {
				result = i + 1;
			}
			if (map.containsKey(prefixSum) == false) {
				map.put(prefixSum, i);
			}
			if (map.containsKey(prefixSum - sum)) {
				result = Math.max(result, i - map.get(prefixSum - sum));
			}
		}
		return result;
	}

}
