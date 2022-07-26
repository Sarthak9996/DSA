package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PreviousSmallerElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of elements in the range");
		int n = sc.nextInt();

		System.err.println("Enter the elements of the array");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}
		System.err.println("Array is : " + ar.toString());

		System.err.print("Smaller Element previous to the current element array is : ");
		previousSmallerElements(ar);

		System.err.print("\nSmaller Element next to the current element array is : ");
		nextSmallerElement(ar);
	}

	static void previousSmallerElements(ArrayList<Integer> ar) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < ar.size(); i++) {
			while (!s.isEmpty() && s.peek() >= ar.get(i)) {
				s.pop();
			}
			if (s.isEmpty()) {
				System.err.print(-1 + " ");
			} else {
				System.err.print(s.peek() + " ");
			}
			s.push(ar.get(i));
		}
	}

	static void nextSmallerElement(ArrayList<Integer> ar) {
		Stack<Integer> s = new Stack<>();
		int[] a = new int[ar.size()];
		for (int i = ar.size() - 1; i >= 0; i--) {
			while (!s.isEmpty() && s.peek() >= ar.get(i)) {
				s.pop();
			}
			if (s.isEmpty()) {
				a[i] = -1;
			} else {
				a[i] = s.peek();
			}
			s.push(ar.get(i));
		}
		for (int i : a) {
			System.err.print(i + " ");
		}
	}
}
