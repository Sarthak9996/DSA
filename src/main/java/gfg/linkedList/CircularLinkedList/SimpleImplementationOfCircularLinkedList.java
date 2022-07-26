package gfg.linkedList.CircularLinkedList;

public class SimpleImplementationOfCircularLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(15);
		head.next.next.next = new Node(20);
		head.next.next.next.next = head;

		System.err.print("The list is : ");
		printDLL(head);
	}

	static void printDLL(Node head) {
		if (head == null) {
			return;
		}

		Node r = head;
		do {
			System.err.print(r.data + " ");
			r = r.next;
		} while (r != head);
	}
}
