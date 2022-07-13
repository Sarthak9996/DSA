package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class EquillibriumPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements in the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println(isEquillibrium(ar) == true ? "The array have a equillibrium point."
				: "The array does not have a equillibrium point.");
	}

	static Boolean isEquillibrium(ArrayList<Integer> ar) {
		int sum = 0;
		for (int i = 0; i < ar.size(); i++) {
			sum += ar.get(i);
		}
		int leftSum = 0;
		for (int i = 0; i < ar.size(); i++) {
			if (leftSum == sum - ar.get(i))
				return Boolean.TRUE;
			leftSum += ar.get(i);
			sum -= ar.get(i);
		}
		return Boolean.FALSE;
	}

}
