package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickSortLomuto {
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

		System.err.println("Unsorted array : " + ar.toString());
		quickSort(ar, 0, n - 1);
		System.err.println("Sorted array : " + ar.toString());

	}

	static void quickSort(ArrayList<Integer> ar, int low, int high) {
		if (low < high) {
			int p = lomutoPartition(ar, low, high);
			quickSort(ar, low, p - 1);
			quickSort(ar, p + 1, high);
		}
	}

	static Integer lomutoPartition(ArrayList<Integer> ar, int low, int high) {

		int pivot = ar.get(high);

		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (ar.get(j) < pivot) {
				i++;
				int temp = ar.get(i);
				ar.set(i, ar.get(j));
				ar.set(j, temp);
			}
		}
		i++;
		int temp = ar.get(i);
		ar.set(i, ar.get(high));
		ar.set(high, temp);

		return i;
	}
}
