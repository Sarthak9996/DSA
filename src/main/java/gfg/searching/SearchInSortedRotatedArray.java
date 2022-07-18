package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInSortedRotatedArray {
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
		
		System.err.println("Index of element by naive method is : "+searchNaive(ar, num));
		System.err.println("Index of element by efficient method is : " + searchEfficient(ar, num));

	}

	// Naive is by applying linear search
	static Integer searchNaive(ArrayList<Integer> ar, int num) {
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i) == num)
				return i;
		}
		return -1;
	}

	static Integer searchEfficient(ArrayList<Integer> ar, int num) {
		int low = 0, high = ar.size() - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar.get(mid) == num)
				return mid;
			if (ar.get(low) < ar.get(mid)) {
				if (num >= ar.get(low) && num < ar.get(mid))
					high = mid - 1;
				else
					low = mid + 1;
			} else {
				if (num > ar.get(mid) && num <= ar.get(high))
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		return -1;
	}
}
