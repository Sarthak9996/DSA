package gfg.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of times the array needs to be rotated ");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the number of elements in the array");
		int l = 0;
		l = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(l);
		ArrayList<Integer> arr = new ArrayList<Integer>(l);
		for (int i = 0; i < l; i++) {
			int temp = sc.nextInt();
			ar.add(temp);
			arr.add(temp);
		}
		sc.close();

		System.err.println("Rotated array by naive solution is : ");
		rotateArray(ar, n);
		System.err.println("\nRotated array by efficient solution is : ");
		rotateArrayEfficiently(arr, n);
	}

	// Naive Solution
	static void rotateArray(ArrayList<Integer> ar, int n) {
		while (n > 0) {
			int temp = ar.get(0);
			for (int i = 1; i < ar.size(); i++) {
				ar.set(i - 1, ar.get(i));
			}
			ar.set(ar.size() - 1, temp);
			n--;
		}
		printArray(ar);
	}

	static void printArray(ArrayList<Integer> ar) {
		for (int i = 0; i < ar.size(); i++) {
			System.err.print(ar.get(i) + " ");
		}
	}

	static void rotateArrayEfficiently(ArrayList<Integer> ar, int n) {
		ArrayList<Integer> temp = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			temp.add(ar.get(i));
		}
		for (int i = n; i < ar.size(); i++) {
			ar.set(i - n, ar.get(i));
		}
		for (int i = 0; i < n; i++) {
			ar.set(ar.size() - n + i, temp.get(i));
		}
		printArray(ar);
	}

}
