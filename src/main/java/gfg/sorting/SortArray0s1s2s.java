package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class SortArray0s1s2s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the range");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}
		System.err.println("Unsorted array is : " + ar.toString());
		sortedArray(ar);
	}

	static void sortedArray(ArrayList<Integer> ar) {
		int low = 0, mid = 0, high = ar.size() - 1;

		while (mid <= high) {
			if (ar.get(mid) == 0) {
				// swap ar.get(low), ar.get(mid)
				int temp = ar.get(low);
				ar.set(low, ar.get(mid));
				ar.set(mid, temp);
				low++;
				mid++;
			} else if (ar.get(mid) == 1) {
				mid++;
			} else {
//				swap ar.get(mid) , ar.get(high)
				int temp = ar.get(mid);
				ar.set(mid, ar.get(high));
				ar.set(high, temp);
				high--;
			}
		} // 1 0 1 1 2 1 0 2

		System.err.println("Sorted array is : " + ar.toString());
	}
}
