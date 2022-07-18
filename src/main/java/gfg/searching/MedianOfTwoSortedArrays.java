package gfg.searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the number of elements in the first array");
		int n1 = 0;
		n1 = sc.nextInt();
		System.err.println("Enter the number of elements in the second array");
		int n2 = 0;
		n2 = sc.nextInt();

		ArrayList<Integer> ar = new ArrayList<Integer>(n1 + n2);

		System.err.println("Enter the elements of the first array");
		ArrayList<Integer> ar1 = new ArrayList<Integer>(n1);
		for (int i = 0; i < n1; i++) {
			int temp = sc.nextInt();
			ar1.add(temp);
			ar.add(temp);
		}

		System.err.println("Enter the elements of the second array");
		ArrayList<Integer> ar2 = new ArrayList<Integer>(n2);
		for (int i = 0; i < n2; i++) {
			int temp = sc.nextInt();
			ar2.add(temp);
			ar.add(temp);
		}

		sc.close();

		System.err.println("Median by naive method : " + medianNaive(ar));
	}

	static Integer medianNaive(ArrayList<Integer> ar) {
		Collections.sort(ar);
		if (ar.size() % 2 == 0) {
			return (ar.get(ar.size() / 2) + ar.get((ar.size() / 2) - 1)) / 2;
		} else {
			return ar.get(ar.size() / 2);
		}
	}

	static Integer medianEfficient(ArrayList<Integer> ar) {
//	TODO
		return null;
	}
}
