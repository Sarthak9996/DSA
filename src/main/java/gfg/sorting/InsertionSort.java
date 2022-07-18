package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
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
		insertionSort(ar);
	}

	static void insertionSort(ArrayList<Integer> ar) {

		for (int i = 1; i < ar.size(); i++) {
			int key = ar.get(i);
			int j = i - 1;
			while (j >= 0 && ar.get(j) > key) {
				ar.set(j + 1, ar.get(j));
				j--;
			}
			ar.set(j + 1, key);
		}

		System.err.println("Sorted array : " + ar.toString());
	}
}
