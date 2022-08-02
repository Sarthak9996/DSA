package gfg.stack;

import java.util.ArrayDeque;

public class SimpleImplementation {
	public static void main(String[] args) {
//	Stack<Integer> stack = new Stack<>();
		ArrayDeque<Integer> stack = new ArrayDeque<>();

		stack.push(10);
		stack.push(15);
		stack.push(20);

		System.err.println(stack);
		System.err.println("Size : " + stack.size());
		System.err.println(stack.peek());
		System.err.println(stack.pop());
		System.err.println(stack.peek());
		System.err.println(stack);
		System.err.println("Size : " + stack.size());
	}
}
