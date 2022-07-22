package gfg.strings;

import java.util.Arrays;
import java.util.Scanner;

public class LeftmostRepeatingCharacter {
	static final int CHAR = 256;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the string");
		String s = sc.next();

		sc.close();

		System.err.println("Index of the leftmost repeating character : " + leftmostRepeatingCharacter(s));
	}

	static Integer leftmostRepeatingCharacter(String s) {
		Boolean[] check = new Boolean[CHAR];
		Arrays.fill(check, false);

		int result = -1;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (check[s.charAt(i)])
				result = i;
			else
				check[s.charAt(i)] = true;
		}
		return result;
	}
}
