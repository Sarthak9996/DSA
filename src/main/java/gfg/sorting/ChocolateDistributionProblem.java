package gfg.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import utils.MyCmpBigSmall;

public class ChocolateDistributionProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of packets of chocolate");
		int n = sc.nextInt();

		System.err.println("Enter the number of chocolates in each packet");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the number of children");
		int k = sc.nextInt();
//		Rules for distribution
//		1. Every child should get only one chocolate.
//		2. Min diff between the child having min diff chocolates and the child having maximum number of chocolates.
		sc.close();

		System.err.println("Minimum Difference after distribution is : " + minDiffChoco(ar, k));
	}

	static Integer minDiffChoco(ArrayList<Integer> ar, int k) {

		if (k > ar.size())
			return -1;

		Collections.sort(ar, new MyCmpBigSmall());

		int result = Integer.MAX_VALUE;
		for (int i = 0; (i + k - 1) < ar.size(); i++) {
			result = Math.min(result, ar.get(i + k - 1) - ar.get(i));
		}
		return result;
	}

}
