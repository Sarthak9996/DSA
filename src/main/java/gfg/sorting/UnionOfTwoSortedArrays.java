package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionOfTwoSortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the first array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the number of elements in the second array");
		int n1 = 0;
		n1 = sc.nextInt();

		System.err.println("Enter the elements of the first array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the elements of the second array");
		ArrayList<Integer> ar1 = new ArrayList<Integer>(n1);
		for (int i = 0; i < n1; i++) {
			ar1.add(sc.nextInt());
		}

		sc.close();

		System.err.print("Union of the two arrays : ");
		union(ar, ar1);
	}

	static void union(ArrayList<Integer> ar, ArrayList<Integer> ar1) {
		int i = 0, j = 0;
		while (i < ar.size() && j < ar1.size()) {
			if (i > 0 && ar.get(i) == ar.get(i - 1)) {
				i++;
				continue;
			}
			if (j > 0 && ar1.get(j) == ar1.get(j - 1)) {
				j++;
				continue;
			}
			if (ar.get(i) < ar1.get(j)) {
				System.err.print(ar.get(i) + " ");
				i++;
			}
			if (ar.get(i) > ar1.get(j)) {
				System.err.print(ar1.get(j) + " ");
				j++;
			}
			if (ar.get(i) == ar1.get(j)) {
				System.err.print(ar.get(i) + " ");
				i++;
				j++;
			}
		}
		while (i < ar.size()) {
			if (i > 0 && ar.get(i) != ar.get(i - 1)) {
				System.err.print(ar.get(i) + " ");
				i++;
			}
		}
		while (j < ar1.size()) {
			if (j > 0 && ar1.get(j) != ar1.get(j - 1)) {
				System.err.print(ar1.get(j) + " ");
				j++;
			}
		}
	}
}
