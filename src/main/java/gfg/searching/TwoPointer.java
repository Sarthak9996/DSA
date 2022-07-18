package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPointer {
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

		System.err.println("Enter the sum total ");
		int sum = 0;
		sum = sc.nextInt();

		sc.close();

		System.err.println(isPairExists(ar, sum) == true ? "Pair Exists" : "Pair does not Exists");
	}

	static Boolean isPairExists(ArrayList<Integer> ar, int sum) {
		int left = 0, right = ar.size() - 1;
		while (left < right) {
			if (ar.get(left) + ar.get(right) == sum)
				return Boolean.TRUE;
			else if (ar.get(left) + ar.get(right) > sum)
				right--;
			else
				left++;
		}
		return Boolean.FALSE;
	}
}
