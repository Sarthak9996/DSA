package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArrayWithDifferentElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = sc.nextInt();

		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Unsorted Array is : " + ar.toString());
		sortArray(ar);
	}

	static void sortArray(ArrayList<Integer> ar) {

		int i = -1, j = ar.size();

		while (true) {
			do {
				i++;
			} while (ar.get(i) < 0);
			do {
				j--;
			} while (ar.get(j) > 0);
			if (i >= j) {
				System.err.println("Sorted Array is : " + ar.toString());
				return;
			}

			int temp = ar.get(i);
			ar.set(i, ar.get(j));
			ar.set(j, temp);
		}
	}

}
