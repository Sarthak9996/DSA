package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class HoarsePartition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements of the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println(
				"Position of the element on which partition is done : " + hoarsePartition(ar, 0, ar.size() - 1));
	}

	static Integer hoarsePartition(ArrayList<Integer> ar, int low, int high) {
		int pivot = ar.get(low);
		int i = low - 1, j = high + 1;
		while (true) {
			do {
				i++;
			} while (ar.get(i) < pivot);
			do {
				j--;
			} while (ar.get(j) > pivot);
			if (i >= j)
				return j;
			int temp = ar.get(i);
			ar.set(i, ar.get(j));
			ar.set(i, temp);
		}
	}
}
