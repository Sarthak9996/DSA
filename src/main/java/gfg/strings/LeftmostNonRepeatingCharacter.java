package gfg.strings;

import java.util.Arrays;
import java.util.Scanner;

public class LeftmostNonRepeatingCharacter {

	static final int CHAR = 256;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the string");
		String s = sc.next();

		sc.close();

		System.err.println("Index of the leftmost non repeating character : " + leftmostNonRepeatingCharacter(s));
	}

	static Integer leftmostNonRepeatingCharacter(String s) {
		Integer[] check = new Integer[CHAR];
		Arrays.fill(check, -1);

		for (int i = 0; i < s.length(); i++) {
			if (check[s.charAt(i)] == -1)
				check[s.charAt(i)] = i;
			else
				check[s.charAt(i)] = -2;
		}

		int result = Integer.MAX_VALUE;
		for (int i = 0; i < CHAR; i++) {
			if (check[i] >= 0)
				result = Math.min(result, check[i]);
		}
		return result == Integer.MAX_VALUE ? -1 : result;
	}
}
