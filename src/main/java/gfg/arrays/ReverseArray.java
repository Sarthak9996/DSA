package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {

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

		System.err.println("Reversed array is : ");
		reverseArray(ar);
	}

	static void reverseArray(ArrayList<Integer> ar) {
		int low = 0, high = ar.size() - 1;
		while (low < high) {
			int temp = ar.get(low);
			ar.set(low, ar.get(high));
			ar.set(high, temp);
			low++;
			high--;
		}

		printArray(ar);
	}

	static void printArray(ArrayList<Integer> ar) {
		for (Integer i : ar) {
			System.err.println(i + " ");
		}
	}

}
