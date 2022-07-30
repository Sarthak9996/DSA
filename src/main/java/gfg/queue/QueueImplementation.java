package gfg.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueImplementation {
	public static void main(String[] args) {
//		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> q = new ArrayDeque<Integer>();

		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);

		System.err.println("Size : " + q.size());
		System.err.println("Elements : " + q);
		System.err.println("Front : " + q.peek());
		System.err.println();
//		q.remove(30);
		q.removeIf(n -> ((n / 2) == 1 && (n % 2) == 0));
		System.err.println("Size : " + q.size());
		System.err.println("Elements : " + q);
		// peek() - element()
		// offer() - add()
		// poll() - remove()
	}
}
