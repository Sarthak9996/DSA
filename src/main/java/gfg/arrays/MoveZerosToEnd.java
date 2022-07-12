package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZerosToEnd {

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

		System.err.println("Array after moving zeros to the end : ");
		moveToEnd(ar);
		System.err.println("Array after moving zeros to the end by efficient method : ");
		moveToEndEfficiently(ar);
	}

	static void moveToEnd(ArrayList<Integer> ar) {
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) == 0) {
				for (int j = i + 1; j < ar.size(); j++) {
					if (ar.get(j) != 0) {
						int temp = ar.get(i);
						ar.set(i, ar.get(j));
						ar.set(j, temp);
					}
				}
			}
		}
		printArray(ar);
	}

	static void printArray(ArrayList<Integer> ar) {
		for (Integer i : ar) {
			System.err.println(i + " ");
		}
	}

	static void moveToEndEfficiently(ArrayList<Integer> ar) {
		int count = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) != 0) {
				int temp = ar.get(i);
				ar.set(i, ar.get(count));
				ar.set(count, temp);
				count++;
			}
		}
		printArray(ar);
	}
}
