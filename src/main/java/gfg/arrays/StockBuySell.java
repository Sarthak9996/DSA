package gfg.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class StockBuySell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number of days for which the price is known");
		int n = 0;
		n = sc.nextInt();

		System.err.println("Enter the prices for the known days");
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			ar.add(sc.nextInt());
		}
		sc.close();

		System.err.println("Maximum Profit by Naive Method : " + maxProfitNaive(ar, 0, ar.size() - 1));
		System.err.println("Maximum Profit by Efficient Method : " + maxProfitEfficient(ar));
	}

	static Integer maxProfitNaive(ArrayList<Integer> ar, int start, int end) {
		if (end <= start) {
			return 0;
		}
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (ar.get(j) > ar.get(i)) {
					int currProfit = ar.get(j) - ar.get(i) + maxProfitNaive(ar, start, i - 1)
							+ maxProfitNaive(ar, j + 1, end);
					profit = Math.max(profit, currProfit);
				}
			}
		}
		return profit;
	}

	static Integer maxProfitEfficient(ArrayList<Integer> ar) {
		int profit = 0;
		for (int i = 1; i < ar.size(); i++) {
			if (ar.get(i) > ar.get(i - 1)) {
				profit += (ar.get(i) - ar.get(i - 1));
			}
		}
		return profit;
	}
}
