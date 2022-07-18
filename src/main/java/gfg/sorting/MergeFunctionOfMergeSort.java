package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeFunctionOfMergeSort {
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

		System.err.println("Enter the starting value from where the first subset of sorted array starts : ");
		int low = 0;
		low = sc.nextInt();

		System.err.println("Enter the ending value to where the first subset of sorted array ends : ");
		int mid = 0;
		mid = sc.nextInt();

		System.err.println("Enter the ending value to where the second subset of sorted array ends : ");
		int high = 0;
		high = sc.nextInt();
		
		sc.close();
		
		System.err.print("Sorted array : ");
		mergeFunction(ar, low, mid, high);
	}

	static void mergeFunction(ArrayList<Integer> ar, int low, int mid, int high) {
		ArrayList<Integer> left = new ArrayList<Integer>(mid - low + 1);
		ArrayList<Integer> right = new ArrayList<Integer>(high - mid);
		for (int i = 0; i < mid - low + 1; i++) {
			left.add(ar.get(low + i));
		}
		for (int i = 0; i < high - mid; i++) {
			right.add(ar.get(mid + i + 1));
		}

		int i = 0, j = 0, k = low;
		while (i < left.size() && j < right.size()) {
			if (left.get(i) <= right.get(j)) {
				ar.set(k, left.get(i));
				k++;
				i++;
			} else {
				ar.set(k, right.get(j));
				k++;
				j++;
			}
		}
		while (i < left.size()) {
			ar.set(k, left.get(i));
			k++;
			i++;
		}
		while (j < right.size()) {
			ar.set(k, right.get(j));
			k++;
			j++;
		}

		System.err.println(ar.toString());
	}
}
