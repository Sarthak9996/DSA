package gfg.strings;

import java.util.Scanner;

public class Subsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter both the strings");
		String s = sc.next();
		String ss = sc.next();

		sc.close();
		System.err.println("second string is subsequence of the first : " + isSubsequence(s, ss));
	}

	static Boolean isSubsequence(String s, String ss) {
		if (s.contains(ss))
			return true;
		else
			return false;
	}

}
