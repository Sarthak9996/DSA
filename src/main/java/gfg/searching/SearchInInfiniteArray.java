package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInInfiniteArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the size of array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter element to be searched");
		int num = 0;
		num = sc.nextInt();

		sc.close();
		
		System.err.println("Index of element by Naive method : "+searchNaive(ar, num));
		System.err.println("Index of element by Efficient method : " + searchEfficient(ar, num));
	}

	static Integer searchNaive(ArrayList<Integer> ar, int num) {
		int i = 0;
		while (true) {
			if (ar.get(i) == num)
				return i;
			if (ar.get(i) > num)
				return -1;
			i++;
		}
	}

	static Integer searchEfficient(ArrayList<Integer> ar, int num) {
		if (ar.get(0) == num)
			return 0;
		int i = 1;
		while (ar.get(i) < num) {
			i = i * 2;
			if (ar.get(i) == num)
				return i;
		}
		return binarySearch(ar, (i / 2) + 1, i - 1, num);
	}

	static Integer binarySearch(ArrayList<Integer> ar, int low, int high, int num) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (ar.get(mid) == num)
			return mid;
		else if (ar.get(mid) > num)
			return binarySearch(ar, low, mid - 1, num);
		else
			return binarySearch(ar, mid + 1, high, num);

	}
}
