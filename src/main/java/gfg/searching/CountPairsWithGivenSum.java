package gfg.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CountPairsWithGivenSum {

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

		System.err.println("Enter the sum to be checked");
		int sum = 0;
		sum = sc.nextInt();

		sc.close();

		System.err.println("Count of Pairs summing up to the given sum : " + countPairs(ar, sum));
	}

	static Integer countPairs(ArrayList<Integer> ar, int sum) {
		int left = 0, right = ar.size() - 1, count = 0;
		Collections.sort(ar);
		while (left < right) {
			if (ar.get(left) + ar.get(right) == sum) {
				count++;
				left++;
				right--;
			} else if (ar.get(left) + ar.get(right) > sum)
				right--;
			else
				left++;
		}
		return count;
	}
}
