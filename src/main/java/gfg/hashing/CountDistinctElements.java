package gfg.hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Count of distinct elements are : " + distinctElements(ar));

	}

	static Integer distinctElements(ArrayList<Integer> ar) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer i : ar) {
			set.add(i);
		}
		return set.size();
	}
}
