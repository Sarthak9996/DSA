package gfg.recursion;

import java.util.Scanner;

public class Subsets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the string");
		String s = sc.next();
		sc.close();

		System.err.println("Subsets are : ");
		subsets(s, "", 0);
	}

	static void subsets(String s, String curr, int i) {
		if (i == s.length()) {
			System.err.print(curr + " ");
			return;
		}

		subsets(s, curr, i + 1);
		subsets(s, curr + s.charAt(i), i + 1);

	}
}
