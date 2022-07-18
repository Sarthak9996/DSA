package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class Count1sInBinaryArray {
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
		
		System.err.println("Occurences of 1 : " + count1(ar));
	}

	static Integer count1(ArrayList<Integer> ar) {
		if (firstOccurence(ar, 1) == -1)
			return 0;
		else
			return ar.size() - firstOccurence(ar, 1);
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
}
