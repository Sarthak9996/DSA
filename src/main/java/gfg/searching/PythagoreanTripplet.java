package gfg.searching;

import java.util.ArrayList;
import java.util.Scanner;

public class PythagoreanTripplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the number n less than which triplets are to be found");
		int n = 0;
		n = sc.nextInt();

		sc.close();

		System.err.println("Number of Triplets : " + countTriples(n));
	}

	static Integer countTriples(int n) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(n);
		for (int i = 1; i <= n; i++) {
			ar.add(i);
		}
		
		int count = 0;

		for (int i = 0; i < ar.size(); i++) {
			count += isPair(ar, ar.get(i));
		}

		return count;
	}

	static Integer isPair(ArrayList<Integer> ar, int c) {
		int left = 0, right = ar.size() - 1, count = 0;
		while (left < right) {
			int a = ar.get(left);
			int b = ar.get(right);
			if (a != c && b != c) {
				if (((a * a) + (b * b)) == (c * c)) {
					count++;
					left++;
					right--;
				} else if (((a * a) + (b * b)) > (c * c)) {
					right--;
				} else {
					left++;
				}
			} else {
				if (a == c)
					left++;
				else if (b == c)
					right--;
			}
		}
		return count * 2;
	}
}
