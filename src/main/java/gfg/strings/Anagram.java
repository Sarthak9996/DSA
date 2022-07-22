package gfg.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static final int CHAR = 256;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter both the strings");

		String s = sc.next();
		String ss = sc.next();

		sc.close();

		System.err.println("String are anagram : " + isAnagram(s, ss));
	}

	static Boolean isAnagram(String s, String ss) {
		if (s.length() != ss.length())
			return false;
		Integer[] count = new Integer[CHAR];
		Arrays.fill(count, 0);
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
			count[ss.charAt(i)]--;
		}

		for (int i = 0; i < CHAR; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
