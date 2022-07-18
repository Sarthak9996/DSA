package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Unsorted array : " + ar.toString());
		selectionSort(ar);
	}

	static void selectionSort(ArrayList<Integer> ar) {

		for (int i = 0; i < ar.size() - 1; i++) {
			int min = i;
			for (int j = i + 1; j < ar.size(); j++) {
				if (ar.get(j) < ar.get(min)) {
					min = j;
				}
			}
			int temp = ar.get(min);
			ar.set(min, ar.get(i));
			ar.set(i, temp);
		}

		System.err.println("Sorted array : " + ar.toString());
	}
}
