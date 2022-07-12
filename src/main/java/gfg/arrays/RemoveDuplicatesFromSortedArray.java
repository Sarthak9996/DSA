package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}
		sc.close();

		System.err.println("Size of the array after removing the duplicates is : " + removeDuplicates(ar));
	}

	static Integer removeDuplicates(ArrayList<Integer> ar) {
		int result = 1;
		for (int i = 1; i < ar.size(); i++) {
			if (ar.get(i) != ar.get(result - 1)) {
				ar.set(result, ar.get(i));
				result++;
			}
		}
		return result;
	}
}
