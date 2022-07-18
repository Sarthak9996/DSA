package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatingElements {
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

		System.err.println("Repeating Element : " + repeatingElement(ar));
	}

	static Integer repeatingElement(ArrayList<Integer> ar) {
		int slow = ar.get(0) + 1, fast = ar.get(0) + 1;
		do {
			slow = ar.get(slow) + 1;
			fast = ar.get(ar.get(fast) + 1) + 1;
		} while (slow != fast);

		slow = ar.get(0) + 1;
		while (slow != fast) {
			fast = ar.get(fast) + 1;
			slow = ar.get(slow) + 1;
		}
		return slow - 1;
	}
}
