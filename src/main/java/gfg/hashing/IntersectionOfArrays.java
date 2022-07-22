package gfg.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOfArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the first array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the number of elements in the second array");
		int n1 = 0;
		n1 = sc.nextInt();

		System.err.println("Enter the elements of the first array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the elements of the second array");
		ArrayList<Integer> ar1 = new ArrayList<Integer>(n1);
		for (int i = 0; i < n1; i++) {
			ar1.add(sc.nextInt());
		}

		sc.close();

		intersection(ar, ar1);
	}

	static void intersection(ArrayList<Integer> a, ArrayList<Integer> b) {
		System.err.print("Intersection : ");
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer i : a) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		for (Integer i : b) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.err.print(m.getKey() + " ");
			}
		}
	}
}
