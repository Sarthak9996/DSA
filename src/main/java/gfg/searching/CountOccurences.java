package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class CountOccurences {
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

		System.err.println("Enter the element for which occurence needs to be counted");
		int num = 0;
		num = sc.nextInt();

		sc.close();

		System.err.println("Occurences : " + countOccurence(ar, num));

	}

	static Integer countOccurence(ArrayList<Integer> ar, int num) {
		if (firstOccurence(ar, num) == -1)
			return 0;
		else
			return (lastOccurence(ar, num) - firstOccurence(ar, num) + 1);
	}

	static Integer firstOccurence(ArrayList<Integer> ar, int num) {
		int low = 0, high = ar.size() - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ar.get(mid) > num)
				high = mid - 1;
			else if (ar.get(mid) < num)
				low = mid + 1;
			else {
				if (mid == 0 || ar.get(mid - 1) != ar.get(mid))
					return mid;
				else
					high = mid - 1;
			}
		}
		return -1;
	}

	static Integer lastOccurence(ArrayList<Integer> ar, int num) {
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
