package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfLastOccurence {
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
		System.err.println("Enter the element to be searched");
		int num = 0;
		num = sc.nextInt();

		sc.close();

		System.err.println("Index of last occurence by iterative method is : " + lastOccurenceIterative(ar, num));
		System.err.println("Index of last occurence by recursive method is : "
				+ lastOccurenceRecursive(ar, 0, ar.size() - 1, num));

	}

	static Integer lastOccurenceRecursive(ArrayList<Integer> ar, int low, int high, int num) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (ar.get(mid) > num)
			return lastOccurenceRecursive(ar, low, mid - 1, num);
		else if (ar.get(mid) < num)
			return lastOccurenceRecursive(ar, mid + 1, high, num);
		else {
			if (mid == ar.size() - 1 || ar.get(mid + 1) != ar.get(mid))
				return mid;
			else
				return lastOccurenceRecursive(ar, mid + 1, high, num);
		}
	}

	static Integer lastOccurenceIterative(ArrayList<Integer> ar, int num) {
		int low = 0, high = ar.size() - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar.get(mid) > num)
				high = mid - 1;
			else if (ar.get(mid) < num)
				low = mid + 1;
			else {
				if (mid == ar.size() - 1 || ar.get(mid) != ar.get(mid + 1))
					return mid;
				else
					low = mid + 1;
			}
		}
		return -1;
	}
}
