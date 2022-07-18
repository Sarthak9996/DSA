package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the first array");
		int n1 = 0;
		n1 = sc.nextInt();

		System.err.println("Enter the number of elements in the second array");
		int n2 = 0;
		n2 = sc.nextInt();

		System.err.println("Enter the elements of the first array");
		ArrayList<Integer> ar1 = new ArrayList<Integer>(n1);
		for (int i = 0; i < n1; i++) {
			ar1.add(sc.nextInt());
		}

		System.err.println("Enter the elements of the second array");
		ArrayList<Integer> ar2 = new ArrayList<Integer>(n2);
		for (int i = 0; i < n2; i++) {
			ar2.add(sc.nextInt());
		}

		sc.close();

		System.err.print("Both arrays merged and sorted : ");

		merge(ar1, ar2);
	}

	static void merge(ArrayList<Integer> ar1, ArrayList<Integer> ar2) {

		int i = 0, j = 0;
		while (i < ar1.size() && j < ar2.size()) {
			if (ar1.get(i) <= ar2.get(j)) {
				System.err.print(ar1.get(i) + " ");
				i++;
			} else {
				System.err.print(ar2.get(j) + " ");
				j++;
			}
		}
		while (i < ar1.size()) {
			System.err.print(ar1.get(i) + " ");
			i++;
		}
		while (j < ar2.size()) {
			System.err.print(ar2.get(j) + " ");
			j++;
		}
	}
}
