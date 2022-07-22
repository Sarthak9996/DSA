package gfg.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import models.Interval_MergingIntervals;

public class MergingIntervals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the total number of intervals");
		int n = sc.nextInt();

		System.err.println("Enter the lower and upper value of the intervals");
		ArrayList<Interval_MergingIntervals> ar = new ArrayList<Interval_MergingIntervals>(n);
		for (int i = 0; i < n; i++) {
			ar.add(new Interval_MergingIntervals(sc.nextInt(), sc.nextInt()));
		}

		sc.close();

//		System.err.println("Unsorted ranges : ");
//		for (Interval_MergingIntervals in : ar) {
//			System.err.println("Interval From " + in.getStart() + " To " + in.getEnd());
//		}

		mergingIntervals(ar);
	}

	static void mergingIntervals(ArrayList<Interval_MergingIntervals> ar) {
		Collections.sort(ar);

		int result = 0;

		for (int i = 1; i < ar.size(); i++) {
			if (ar.get(result).getEnd() >= ar.get(i).getStart()) {
				ar.get(result).setStart(Math.min(ar.get(result).getStart(), ar.get(i).getStart()));
				ar.get(result).setEnd(Math.max(ar.get(result).getEnd(), ar.get(i).getEnd()));
			} else {
				result++;
				ar.set(result, ar.get(i));
			}
		}

		System.err.println("Final intervals : ");
		for (int i = 0; i <= result; i++) {
			System.err.println("Interval From " + ar.get(i).getStart() + " To " + ar.get(i).getEnd());
		}

	}
}
