package gfg.stack;

import java.util.Stack;

public class StockSpan {
	public static void main(String[] args) {
		int[] ar = { 60, 10, 20, 15, 35, 50 };
		printSpanNaive(ar);
		System.err.println();
		printSpanEfficient(ar);
	}

	public static void printSpanNaive(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			int span = 1;
			for (int j = i - 1; j >= 0 && ar[j] <= ar[i]; j--) {
				span++;
			}
			System.err.print(span + " ");
		}
	}

	public static void printSpanEfficient(int ar[]) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(0);

		System.err.print("1 ");

		for (int i = 1; i < ar.length; i++) {
			while (!s.isEmpty() && ar[s.peek()] <= ar[i]) {
				s.pop();
			}
			int span = s.isEmpty() ? i + 1 : i - s.peek();
			System.err.print(span + " ");
			s.push(i);
		}
	}
}
