package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

//In lomuto partition we consider the last element as the pivot if the pivot is given and is not last we swap it with the last and make the pivot last element
public class LomutoPartition {
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

		System.err.println("Index of last element after the partition : " + lomutoPartition(ar, 0, ar.size() - 1));

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
