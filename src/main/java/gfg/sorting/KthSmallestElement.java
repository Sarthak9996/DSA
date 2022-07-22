package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;
//10,4,5,8,11,6,26
public class KthSmallestElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array : ");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array : ");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the value of k : ");
		int k = sc.nextInt();

		sc.close();

		System.err.println(k + "th smallest element : " + kthSmallestElement(ar, k));
	}

	static Integer kthSmallestElement(ArrayList<Integer> ar, int k) {
		int low = 0, high = ar.size() - 1;
		while (low <= high) {
			int p = lomutoPartition(ar, low, high);
			if (p == (k - 1))
				return ar.get(p);
			else if (p > k - 1) {
				high = p - 1;
			} else {
				low = p + 1;
			}
		}
		return -1;
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
