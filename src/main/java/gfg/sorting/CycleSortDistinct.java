package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleSortDistinct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		cycleSortDistinct(ar);
	}

	static void cycleSortDistinct(ArrayList<Integer> ar) {
		for (int cs = 0; cs < ar.size() - 1; cs++) {
			int item = ar.get(cs);
			int pos = cs;
			for (int i = cs + 1; i < ar.size(); i++) {
				if (ar.get(i) < item)
					pos++;
			}
			int temp = item;
			item = ar.get(pos);
			ar.set(pos, temp);

			while (pos != cs) {
				pos = cs;
				for (int i = cs + 1; i < ar.size(); i++) {
					if (ar.get(i) < item)
						pos++;
				}
				temp = item;
				item = ar.get(pos);
				ar.set(pos, temp);
			}
		}

		System.err.println("Sorted array of distinct elements : " + ar.toString());
	}
}
