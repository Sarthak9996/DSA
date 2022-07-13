package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumGroupFlipsToMakeSame {
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

		System.err.println("Flips needed : ");
		minFlips(ar);
	}

	static void minFlips(ArrayList<Integer> ar) {
		for (int i = 1; i < ar.size(); i++) {
			if (ar.get(i) != ar.get(i - 1)) {
				if (ar.get(i) != ar.get(0)) {
					System.err.print("From " + i + " to ");
				} else {
					System.err.print((i - 1) + "\n");
				}
			}
		}
		if (ar.get(ar.size() - 1) != ar.get(0)) {
			System.err.print(ar.size() - 1);
		}
	}
}
