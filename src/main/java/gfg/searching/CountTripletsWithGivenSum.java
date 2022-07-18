package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

//Not correct
//Not tested
//TODO
public class CountTripletsWithGivenSum {
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

		System.err.println("Enter the sum for which triplet needs to be checked");
		int sum = 0;
		sum = sc.nextInt();

		sc.close();

		System.err.println("Number of triplets summing up to the given sum : " + tripletCount(ar, sum));
	}

	static Integer tripletCount(ArrayList<Integer> ar, int sum) {
		int count = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (isPair(ar, i + 1, ar.size() - 1, sum - ar.get(i))) {
				count++;
			}
		}
		return count;
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
