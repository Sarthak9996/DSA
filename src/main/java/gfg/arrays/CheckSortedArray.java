package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckSortedArray {

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

		System.err.println(isSortedArray(ar) == true ? "Array is sorted." : "Array is not sorted.");

	}

	static Boolean isSortedArray(ArrayList<Integer> ar) {
		for (int i = 0; i < ar.size() - 1; i++) {
			if (ar.get(i) > ar.get(i + 1))
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
}
