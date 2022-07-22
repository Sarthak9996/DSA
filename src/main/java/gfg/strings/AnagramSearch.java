package gfg.strings;

import java.util.Scanner;

public class AnagramSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the first string");
		String s = sc.next();

		System.err.println("Enter the pattern whose anagram needs to be checked");
		String ss = sc.next();

		sc.close();

		System.err.println("Anagram is present : " + anagramSearch(s, ss));
	}

	static Boolean anagramSearch(String s, String ss) {

		// TODO
		return null;
	}
}
