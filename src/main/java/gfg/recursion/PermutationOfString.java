package gfg.recursion;

import java.util.Scanner;

public class PermutationOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.println("Enter the String");
		String s = "";
		s = sc.next();

		sc.close();

		System.err.println("All permutations are : ");
		permute(s, 0);
	}

	static void permute(String s, int i) {
		if (i == s.length() - 1)
			System.err.print(s + " ");
		else {
			for (int j = i; j <= s.length() - 1; j++) {
				s = swap(s, i, j);
				permute(s, i + 1);
				s = swap(s, i, j);
			}
		}
	}

	static String swap(String s, int i, int j) {
		char temp;
		char[] charr = s.toCharArray();
		temp = charr[i];
		charr[i] = charr[j];
		charr[j] = temp;
		return String.valueOf(charr);
	}

}
