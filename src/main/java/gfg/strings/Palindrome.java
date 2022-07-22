package gfg.strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the string");
		String s = sc.next();

		System.err.println(s + " is palindrome : " + isPalindrome(s));
		System.err.println(s + " is palindrome by efficient method : " + isPalindromeEfficient(s));
	}

	static Boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);

		sb = sb.reverse();
		System.err.println(sb);
		System.err.println(sb.reverse());
		return sb.equals(sb.reverse().toString());

	}

	static Boolean isPalindromeEfficient(String s) {
		int begin = 0;
		int end = s.length() - 1;
		while (begin < end) {
			if (s.charAt(begin) != s.charAt(end)) {
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}
}
