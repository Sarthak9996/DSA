package gfg.strings;

import java.util.Arrays;
import java.util.Scanner;

public class FrequenciesOfCharacterInSortedOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("Enter the string");
		String s = sc.next();

		System.err.println("Frequencies are : ");
		Integer[] count = new Integer[26];
		Arrays.fill(count, 0);

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a'] += 1;
		}
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.err.println((char) (i + 'a') + " : " + count[i]); 
			}
		}
	}
}
