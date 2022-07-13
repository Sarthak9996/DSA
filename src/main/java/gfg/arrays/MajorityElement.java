package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements of the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Majority Element by naive method : " + majorityElementNaive(ar));
		System.err.println("Majority Element by efficient method : " + majorityElementEfficient(ar));
	}

	static Integer majorityElementNaive(ArrayList<Integer> ar) {
		for (int i = 0; i < ar.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < ar.size(); j++) {
				if (ar.get(i) == ar.get(j)) {
					count++;
				}
			}
			if (count > (ar.size() / 2)) {
				return ar.get(i);
			}
		}
		return -1;
	}

	static Integer majorityElementEfficient(ArrayList<Integer> ar) {
		int result = 0, count = 1;
		for (int i = 1; i < ar.size(); i++) {
			if (ar.get(result) == ar.get(i))
				count++;
			else
				count--;
			if (count == 0) {
				result = i;
				count = 1;
			}
		}

		count = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(result) == ar.get(i))
				count++;
		}
		if (count <= (ar.size() / 2))
			result = -1;
		else
			result = ar.get(result);
		return result;
	}
}
