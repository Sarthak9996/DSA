package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

//Given array is a sorted array
public class FrequenciesInSortedArray {
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

		System.err.println("Frequencies of the elements are : ");
		frequency(ar);
	}

	static void frequency(ArrayList<Integer> ar) {
		int count = 1, i = 1;
		while (i < ar.size()) {
			while (i < ar.size() && ar.get(i) == ar.get(i - 1)) {
				count++;
				i++;
			}
			System.err.println(ar.get(i - 1) + " : " + count);
			i++;
			count = 1;
		}
		if (ar.size() == 1 || ar.get(ar.size() - 1) != ar.get(ar.size() - 2)) {
			System.err.println(ar.get(ar.size() - 1) + " : 1");
		}
	}
}
