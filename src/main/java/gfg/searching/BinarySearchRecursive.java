package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchRecursive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements in the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the element to be searched");
		int num = 0;
		num = sc.nextInt();

		sc.close();

		System.err.println("Element present at index : " + binarySearchRecursive(ar, 0, ar.size() - 1, num));
	}

	static Integer binarySearchRecursive(ArrayList<Integer> ar, int low, int high, int num) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (ar.get(mid) == num)
			return mid;
		else if (ar.get(mid) > num)
			return binarySearchRecursive(ar, low, mid - 1, num);
		else
			return binarySearchRecursive(ar, mid + 1, high, num);
	}
}
