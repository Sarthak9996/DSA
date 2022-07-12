package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {

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

		System.err.println("Leaders are : ");
		leaders(ar);
	}

	static void leaders(ArrayList<Integer> ar) {
		int currLeader = ar.get(ar.size() - 1);
		System.err.print(currLeader + " ");
		for (int i = ar.size() - 2; i >= 0; i--) {
			if (ar.get(i) > currLeader) {
				currLeader = ar.get(i);
				System.err.print(currLeader + " ");
			}
		}
	}
}
