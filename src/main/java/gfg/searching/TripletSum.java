package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class TripletSum {
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

		System.err.println("Enter the sum total");
		int sum = 0;
		sum = sc.nextInt();

		sc.close();

		System.err.println(isTriplet(ar, sum) == true ? "Triplet exists" : "Triplet doesn't exists");

	}

	static Boolean isTriplet(ArrayList<Integer> ar, int sum) {
		for (int i = 0; i < ar.size(); i++) {
			if (isPair(ar, i + 1, ar.size() - 1, sum - ar.get(i)))
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	static Boolean isPair(ArrayList<Integer> ar, int left, int right, int sum) {
		if (left > right)
			return Boolean.FALSE;
		if (ar.get(left) + ar.get(right) == sum)
			return Boolean.TRUE;
		else if (ar.get(left) + ar.get(right) > sum)
			return isPair(ar, left, right - 1, sum);
		else
			return isPair(ar, left + 1, right, sum);
	}

}
