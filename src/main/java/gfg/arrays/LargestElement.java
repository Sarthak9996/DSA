package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestElement {
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

		System.err.println("Largest element in the array : " + fetchLargest(ar));
	}

	static Integer fetchLargest(ArrayList<Integer> ar) {
		int max = ar.get(0);

		for (int i = 0; i < ar.size(); i++) {
			if (max < ar.get(i))
				max = ar.get(i);
		}
		return max;
	}
}
