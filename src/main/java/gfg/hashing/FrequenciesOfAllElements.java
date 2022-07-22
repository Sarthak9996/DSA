package gfg.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FrequenciesOfAllElements {
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

		frequenciesOfElements(ar);
	}

	static void frequenciesOfElements(ArrayList<Integer> ar) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer i : ar) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			System.err.println("Frequency of " + m.getKey() + " is : " + m.getValue());
		}
	}
}
