package gfg.recursion;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the string");
		String s = "";
		s = sc.next();
		sc.close();
		System.err.println(
				isPalindrome(s, 0, s.length() - 1) == true ? "String is palindrome" : "String is not palindrome");
	}

	static Boolean isPalindrome(String s, int start, int end) {
		if (start >= end)
			return true;
		return ((s.charAt(start) == s.charAt(end)) && isPalindrome(s, start + 1, end - 1));
	}

}
