package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class TrappingRainWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of bars");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the size of the bars");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}

		sc.close();

		System.err.println("Water held by Naive Method is : " + waterHeld(ar));
		System.err.println("Water held by Efficient Method is : " + waterHeldEfficient(ar));
	}

	static Integer waterHeld(ArrayList<Integer> ar) {
		int result = 0;
		for (int i = 0; i < ar.size() - 1; i++) {
			int lMax = ar.get(i);
			for (int j = 0; j < i; j++) {
				lMax = Math.max(lMax, ar.get(j));
			}
			int rMax = ar.get(i);
			for (int j = i + 1; j < ar.size(); j++) {
				rMax = Math.max(rMax, ar.get(j));
			}
			result = result + (Math.min(lMax, rMax) - ar.get(i));
		}
		return result;
	}

	static Integer waterHeldEfficient(ArrayList<Integer> ar) {
		int result = 0;
		int n = ar.size();

		ArrayList<Integer> lMax = new ArrayList<Integer>(n);
		lMax = fillZeros(lMax, n);
		ArrayList<Integer> rMax = new ArrayList<Integer>(n);
		rMax = fillZeros(rMax, n);

		lMax.set(0, ar.get(0));
		for (int i = 1; i < ar.size(); i++) {
			lMax.set(i, Math.max(ar.get(i), lMax.get(i - 1)));
		}
		rMax.set(n - 1, ar.get(n - 1));
		for (int i = n - 2; i >= 0; i--) {
			rMax.set(i, Math.max(ar.get(i), rMax.get(i + 1)));
		}

		for (int i = 1; i < ar.size() - 1; i++) {
			result += Math.min(lMax.get(i), rMax.get(i)) - ar.get(i);
		}
		return result;
	}

	static ArrayList<Integer> fillZeros(ArrayList<Integer> ar, int n) {
		for (int i = 0; i < n; i++) {
			ar.add(0);
		}
		return ar;
	}
}
