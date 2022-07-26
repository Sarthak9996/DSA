package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the size of the array");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		System.err.println("Enter the sum of subarray to be checked");
		int s = 0;
		s = sc.nextInt();

		sc.close();

		System.err.println(subarraySum(ar, s) == true ? "Array consists a subarray of sum " + s
				: "Array doesn't consist a subarray of sum " + s);
	}

	static Boolean subarraySum(ArrayList<Integer> ar, int sum) {
		int curr_sum = ar.get(0), start = 0;
		for (int i = 1; i < ar.size(); i++) {
			while (curr_sum > sum && start < i - 1) {
				curr_sum -= ar.get(start);
				start++;
			}
			if (i < ar.size())
				curr_sum += ar.get(i);
			if (curr_sum == sum)
				return true;
		}
		return (curr_sum == sum);
	}
	
}
