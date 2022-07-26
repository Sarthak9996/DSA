package gfg.linkedList.CircularLinkedList;

public class DeleteHeadOfCircularLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
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

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(15);
		head.next.next.next = new Node(20);
		head.next.next.next.next = head;

		System.err.print("The list is : ");
		printDLL(head);

		head = deleteHead(head);

		System.err.print("\nThe new list is : ");
		printDLL(head);

	}

	static Node deleteHead(Node head) {
		if (head == null || head.next == null)
			return null;

		head.data = head.next.data;
		head.next = head.next.next;

		return head;
	}

}
