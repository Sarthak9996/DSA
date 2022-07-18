package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class NaivePartition {
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

		System.err.println("Enter the pivot");
		int p = 0;
		p = sc.nextInt();

		sc.close();

		System.err.println("Position of the element after partition : " + partitionNaive(ar, 0, ar.size() - 1, p));
	}

	static Integer partitionNaive(ArrayList<Integer> ar, int low, int high, int p) {
		ArrayList<Integer> temp = new ArrayList<Integer>(high - low + 1);
		for (int i = low; i <= high; i++) {
			if (ar.get(i) < ar.get(p)) {
				temp.add(ar.get(i));
			}
		}
		for (int i = low; i <= high; i++) {
			if (ar.get(i) == ar.get(p)) {
				temp.add(ar.get(i));
			}
		}

		int result = low + temp.size() - 1;

		for (int i = low; i <= high; i++) {
			if (ar.get(i) > ar.get(p)) {
				temp.add(ar.get(i));
			}
		}

		for (int i = low; i <= high; i++) {
			ar.set(i, temp.get(i));
		}

		return result;
	}
}
