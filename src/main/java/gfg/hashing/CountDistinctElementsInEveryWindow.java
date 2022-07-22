package gfg.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountDistinctElementsInEveryWindow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the size of the window");
		int k = sc.nextInt();

		sc.close();

		distinctElementCount(ar, k);
	}

	static void distinctElementCount(ArrayList<Integer> ar, int k) {
		System.err.print("Count of distint elements in each window are : ");
		HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < k; i++) {
			freqMap.put(ar.get(i), freqMap.getOrDefault(ar.get(i), 0) + 1);
		}
		System.err.print(freqMap.size() + " ");

		for (int i = k; i < ar.size(); i++) {
			// removal of the element before the start of the curr window
			freqMap.put(ar.get(i - k), freqMap.get(ar.get(i - k)) - 1);
			if (freqMap.get(ar.get(i - k)) == 0) {
				freqMap.remove(ar.get(i - k));
			}

			freqMap.put(ar.get(i), freqMap.getOrDefault(ar.get(i), 0) + 1);

			System.err.print(freqMap.size() + " ");
		}
	}
}
