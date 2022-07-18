package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

//The maximum possible optimization in bubble sort is we can avoid running the inner loop till n-1 rather running it to n-i-1
public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements in the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Unsorted array : " + ar.toString());
		bubbleSort(ar);
		bubbleSortOptimised(ar);

	}

	static void bubbleSort(ArrayList<Integer> ar) {

		for (int i = 0; i < ar.size() - 1; i++) {
			for (int j = 0; j < ar.size() - i - 1; j++) {
				if (ar.get(j) > ar.get(j + 1)) {
					int temp = ar.get(j);
					ar.set(j, ar.get(j + 1));
					ar.set(j + 1, temp);
				}
			}
		}
		System.err.println("Sorted array : " + ar.toString());
	}

	static void bubbleSortOptimised(ArrayList<Integer> ar) {
		for (int i = 0; i < ar.size(); i++) {
			Boolean swapped = Boolean.FALSE;
			for (int j = 0; j < ar.size() - i - 1; j++) {
				if (ar.get(j) > ar.get(j + 1)) {
					int temp = ar.get(j);
					ar.set(j, ar.get(j + 1));
					ar.set(j + 1, temp);
					swapped = Boolean.TRUE;
				}
			}
			if (swapped == Boolean.FALSE)
				break;
		}
		System.err.println("Sorted array by optimised method : " + ar.toString());
	}
}
