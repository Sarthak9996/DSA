package gfg.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumGuests {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of guests");
		int n = sc.nextInt();

		System.err.println("Enter the arrival times of all the guests");
		Integer[] arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.err.println("Enter the departure time of all the guests");
		Integer[] dep = new Integer[n];
		for (int i = 0; i < n; i++) {
			dep[i] = sc.nextInt();
		}

		System.err.println("Maximum Guests whom the coder will be able to meet is/are : " + maximumGuests(arr, dep));
	}

	static Integer maximumGuests(Integer[] ar, Integer[] de) {

		Arrays.sort(ar);
		Arrays.sort(de);

		int i = 1, j = 0, result = 1, curr = 1;

		while (i < ar.length && j < de.length) {
			if (ar[i] < de[j]) {
				i++;
				curr++;
			} else {
				curr--;
				j++;
			}
			result = Math.max(result, curr);
		}
		return result;
	}
}
