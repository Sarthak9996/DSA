package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {
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

		System.err.print("Intersection of the two arrays : ");
		intersection(ar, ar1);
	}

	static void intersection(ArrayList<Integer> ar, ArrayList<Integer> ar1) {
		int i = 0, j = 0;
		while (i < ar.size() && j < ar1.size()) {
			if (i > 0 && ar.get(i) == ar.get(i - 1)) {
				i++;
				continue;
			}
			if (ar.get(i) < ar1.get(j)) {
				i++;
			} else if (ar.get(i) > ar1.get(j)) {
				j++;
			} else {
				System.err.print(ar.get(i) + " ");
				i++;
				j++;
			}
		}
	}
}
