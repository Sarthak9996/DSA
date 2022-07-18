package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

//Inversion is when i<j but a[i]>a[j]
public class CountInversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements in the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Number of inversions : " + inversions(ar, 0, ar.size() - 1));

	}

	static Integer inversions(ArrayList<Integer> ar, int l, int r) {
		int result = 0;

		if (l < r) {
			int m = l + (r - l) / 2;
			result += inversions(ar, l, m);
			result += inversions(ar, m + 1, r);
			result += countAndMerge(ar, l, m, r);
		}

		return result;
	}

	static Integer countAndMerge(ArrayList<Integer> ar, int low, int mid, int high) {
		int result = 0;

		ArrayList<Integer> left = new ArrayList<Integer>(mid - low + 1);
		ArrayList<Integer> right = new ArrayList<Integer>(high - mid);
		for (int i = 0; i < mid - low + 1; i++) {
			left.add(ar.get(low + i));
		}
		for (int i = 0; i < high - mid; i++) {
			right.add(ar.get(mid + 1 + i));
		}

		int i = 0, j = 0, k = low;
		while (i < left.size() && j < right.size()) {
			if (left.get(i) <= right.get(j)) {
				ar.set(k, left.get(i));
				i++;
				k++;
			} else {
				ar.set(k, right.get(j));
				j++;
				result += mid - low + 1 - i;
				k++;
			}
		}
		while (i < left.size()) {
			ar.set(k, left.get(i));
			i++;
			k++;
		}
		while (j < right.size()) {
			ar.set(k, right.get(j));
			j++;
			k++;
		}
		return result;
	}
}
