package gfg.strings;

import java.util.Scanner;

public class PatternMatchingNaive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the string");
		String s = sc.next();

		System.err.println("Enter the pattern");
		String p = sc.next();

		sc.close();

		patternSearching(s, p);
	}

	static void patternSearching(String s, String p) {
		System.err.print("Pattern present at index : ");
		int m = p.length(), n = s.length();
		for (int i = 0; i <= n - m; i++) {
			{
				int j;
				for (j = 0; j < m; j++) {
					if (p.charAt(j) != s.charAt(i + j)) {
						break;
					}
				}
				if (j == m) {
					System.err.print(i + " ");
				}
			}
		}
	}

	static void improvedNaiveAlgorithmForDistinct(String s, String p) {
		System.err.print("Pattern present at index : ");
		int m = p.length(), n = s.length();
		for (int i = 0; i < n - m;) {
			int j;
			for (j = 0; j < m; j++) {
				if (p.charAt(j) != s.charAt(i + j)) {
					break;
				}
				if (j == m) {
					System.err.print(i + " ");
				}
				if (j == 0) {
					i++;
				} else {
					i = i + j;
				}
			}
		}
	}
}
