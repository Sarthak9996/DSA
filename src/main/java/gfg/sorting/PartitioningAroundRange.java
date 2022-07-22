package gfg.sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class PartitioningAroundRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the lower value of the range for partition");
		int lower = sc.nextInt();

		System.err.println("Enter the upper value of the range for partition");
		int higher = sc.nextInt();

		sc.close();

		System.err.println("Unpartitioned Array is : " + ar.toString());

		partitionRange(ar, lower, higher);
	}

	static void partitionRange(ArrayList<Integer> ar, int lower, int higher) {
		int i = 0, start = 0, high = ar.size() - 1;

		while (i <= high) {
			if (ar.get(i) < lower) {
				// below range case swap ar.get(i), ar.get(start)
				int temp = ar.get(i);
				ar.set(i, ar.get(start));
				ar.set(start, temp);
				i++;
				start++;
			} else if (ar.get(i) > higher) {
				// above range case swap ar.get(i), ar.get(end)
				int temp = ar.get(i);
				ar.set(i, ar.get(high));
				ar.set(high, temp);
				high--;
			} else {
				// mid case
				i++;
			}
		}

		System.err.println("Partitioned array is : " + ar.toString());

	}
	
//	arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32}  
//  lowVal = 14, highVal = 20
}
