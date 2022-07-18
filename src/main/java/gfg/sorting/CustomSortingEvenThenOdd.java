package gfg.sorting;

import java.util.Arrays;
import java.util.Scanner;

import utils.MyCmpEvenOdd;

public class CustomSortingEvenThenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		Integer ar[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			ar[i] = (sc.nextInt());
		}

		sc.close();

		Arrays.sort(ar, new MyCmpEvenOdd());

		System.err.println("Sorted array : " + Arrays.toString(ar));
	}
}
