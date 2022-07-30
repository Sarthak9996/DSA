package gfg.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbersWithGivenDigits {
	public static void main(String[] args) {
		int n = 5;

		printNumbers(5);
	}

	static void printNumbers(int n) {
		Queue<String> q = new LinkedList<>();

		q.add("5");
		q.add("6");

		for (int i = 0; i < n; i++) {
			String curr = q.poll();

			System.err.print(curr + " ");

			q.add(curr + "5");
			q.add(curr + "6");
		}

	}
}
