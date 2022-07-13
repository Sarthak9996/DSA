package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumConsecutive1s {
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

		System.err.println("Maximum consecutive 1 in the array are : " + maximumConsecutive(ar));
	}

	static Integer maximumConsecutive(ArrayList<Integer> ar) {
		int result = 0, curr = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) != 1)
				curr = 0;
			else {
				curr++;
				result = Math.max(curr, result);
			}
		}
		return result;
	}
}
