package gfg.linkedList;

public class NthNodeFromEndOfSinglyLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	static void printListRecursively(Node head) {

		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printListRecursively(head.next);
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;

		System.err.print("\nThe List is : ");
		printListRecursively(head);

		int n = 2;
		System.err.println("\n" + n + "th Node from end is : " + nthNodeFromEnd(head, n));
	}

	static Integer nthNodeFromEnd(Node head, int n) {
		if (head == null)
			return -1;

		Node first = head;
		for (int i = 0; i < n; i++) {
			if (first == null)
				return -1;
			first = first.next;
		}
		Node second = head;
		while (first != null) {
			second = second.next;
			first = first.next;
		}
		return second.data;
	}

}
