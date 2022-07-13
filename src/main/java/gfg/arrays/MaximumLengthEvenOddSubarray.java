package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumLengthEvenOddSubarray {

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

		System.err.println("Maximum Length of Even Odd Subarray by naive method is : " + evenOdd(ar));
		System.err.println("Maximum Length of Even Odd Subarray by efficient method is : " + evenOddEfficient(ar));
	}

	static Integer evenOdd(ArrayList<Integer> ar) {
		int result = 0;

		for (int i = 0; i < ar.size(); i++) {
			int curr = 1;
			for (int j = i + 1; j < ar.size(); j++) {
				if ((ar.get(j) % 2 == 0 && ar.get(j - 1) % 2 != 0) || (ar.get(j) % 2 != 0 && ar.get(j - 1) % 2 == 0))
					curr++;
				else
					break;
			}
			result = Math.max(result, curr);
		}

		return result;
	}

	static Integer evenOddEfficient(ArrayList<Integer> ar) {
		int result = 1, curr = 1;
		for (int i = 1; i < ar.size(); i++) {
			if ((ar.get(i) % 2 == 0 && ar.get(i - 1) % 2 != 0) || (ar.get(i) % 2 != 0 && ar.get(i - 1) % 2 == 0)) {
				curr++;
				result = Math.max(curr, result);
			} else {
				curr = 1;
			}
		}
		return result;
	}

}
