package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

//Only works on sorted arrays
public class BinarySearchIterative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the element to be searched");
		int num = 0;
		num = sc.nextInt();

		sc.close();

		System.err.println("Element present at index : " + binarySearch(ar, num));
	}

	static Integer binarySearch(ArrayList<Integer> ar, int num) {
		int low = 0, high = ar.size() - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar.get(mid) == num) {
				return mid;
			} else if (ar.get(mid) > num) {
				high = mid - 1;
			} else if (ar.get(mid) < num) {
				low = mid + 1;
			}
		}
		return -1;
	}
}
