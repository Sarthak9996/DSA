package gfg.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import utils.MyCmpBigSmall;

public class MinimumDifference {
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

		System.err.println("Minimum Difference is : " + minimumDifference(ar));
	}

	static Integer minimumDifference(ArrayList<Integer> ar) {
		Collections.sort(ar, new MyCmpBigSmall());

		int result = Integer.MAX_VALUE;

		for (int i = 1; i < ar.size(); i++) {
			result = Math.min(result, ar.get(i) - ar.get(i - 1));
		}
		return result;
	}
}
