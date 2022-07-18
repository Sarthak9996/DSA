package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class PeakElements {
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

		System.err.println("Peak Element is at index : " + peakElement(ar));
	}

	static Integer peakElement(ArrayList<Integer> ar) {
		int low = 0, high = ar.size() - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if ((mid == 0 || ar.get(mid) > ar.get(mid - 1)) && (mid == ar.size() - 1 || ar.get(mid) < ar.get(mid + 1)))
				return mid;
			if (mid > 0 && ar.get(mid - 1) >= ar.get(mid))
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
