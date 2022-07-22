package gfg.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MoreThanNbyKOccurences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the value of k");
		int k = sc.nextInt();

		sc.close();

		moreThanNbyKOccurences(ar, k);
	}

	static void moreThanNbyKOccurences(ArrayList<Integer> ar, int k) {
		System.err.print("Elements with more than n/k occurences are : ");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : ar) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > (ar.size() / k)) {
				System.err.print(m.getKey() + " ");
			}
		}
	}

	static void moreThanNbyKOccurencesEfficient(ArrayList<Integer> ar, int k) {
		System.err.print("Elements with more than n/k occurences are : ");

//		Implement Moore's voting algorithm to find the candidate and check and print
	}
}
