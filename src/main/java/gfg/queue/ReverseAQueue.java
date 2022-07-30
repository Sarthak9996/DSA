package gfg.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
	static void print(Queue<Integer> queue) {
		for (Integer x : queue)
			System.out.print(x + " ");
	}

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(12);
		queue.add(5);
		queue.add(15);
		queue.add(20);

		reversequeue(queue);
		print(queue);
		System.err.println();
		reverseRecursive(queue);
		print(queue);

	}

	static void reversequeue(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty()) {
			stack.add(queue.peek());
			queue.remove();
		}
		while (!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
	}

	static void reverseRecursive(Queue<Integer> q) {
		if (q.isEmpty())
			return;

		int x = q.peek();
		q.remove();

		reverseRecursive(q);
		q.add(x);

	}
}
