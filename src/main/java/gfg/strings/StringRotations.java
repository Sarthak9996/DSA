package gfg.strings;

import java.util.Scanner;

public class StringRotations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the first string");
		String s = sc.next();

		System.err.println("Enter the string to be checked");
		String ss = sc.next();

		sc.close();

		System.err.println("The string is rotated : " + isRotation(s, ss));
	}

	static Boolean isRotation(String s, String ss) {
		if (s.length() != ss.length())
			return false;
		return ((s + s).indexOf(ss) >= 0);
	}
}
