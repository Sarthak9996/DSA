package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondLargest {
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

		System.err.println(
				"Second largest element in the array by naive method is at index : " + secondLargestElementByNaive(ar));
		System.err.println("Second largest element in the array by efficient method is at index : "
				+ secondLargestElementByEfficient(ar));

	}

	static Integer secondLargestElementByNaive(ArrayList<Integer> ar) {
		int largest = largestElement(ar);
		int result = -1;
		for (int i = 0; i < ar.size(); i++) {
			if (largest != ar.get(i)) {
				if (result == -1 || ar.get(result) < ar.get(i))
					result = i;
			}
		}
		return result;
	}

	static Integer largestElement(ArrayList<Integer> ar) {
		int max = ar.get(0);
		for (int i = 0; i < ar.size(); i++) {
			if (max < ar.get(i))
				max = ar.get(i);
		}
		return max;
	}

	static Integer secondLargestElementByEfficient(ArrayList<Integer> ar) {
		int result = -1, largest = 0;
		for (int i = 1; i < ar.size(); i++) {
			if (ar.get(i) > ar.get(largest)) {
				result = largest;
				largest = i;
			} else if (ar.get(i) < ar.get(largest)) {
				if (result == -1 || ar.get(i) > ar.get(result))
					result = i;
			}
		}
		return result;
	}
}
