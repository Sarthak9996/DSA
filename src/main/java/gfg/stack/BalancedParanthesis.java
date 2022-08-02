package gfg.stack;

import java.util.ArrayDeque;

public class BalancedParanthesis {
	public static void main(String[] args) {
		String s = "{()}[]";
		System.err.println("Balanced Paranthesis : " + isValid(s));
	}

	public static boolean isValid(String s) {

		ArrayDeque<Character> st = new ArrayDeque<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '{' || c == '[' || c == '(') {
				st.push(c);
			} else {
				if (st.isEmpty()) {
					return false;
				} else if (!matching(st.peek(), c)) {
					return false;
				} else {
					st.pop();
				}
			}
		}
		return st.isEmpty();
	}

	public static boolean matching(char a, char b) {
		return ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}'));
	}
}
