package utils;

import java.util.Comparator;

public class MyCmpBigSmall implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		return a - b;
	}
}
