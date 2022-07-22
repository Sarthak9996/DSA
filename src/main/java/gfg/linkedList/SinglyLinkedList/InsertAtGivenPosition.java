package gfg.linkedList.SinglyLinkedList;

public class InsertAtGivenPosition {
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	static Node insertAtEnd(Node head, int x) {
		Node temp = new Node(x);

		if (head == null) {
			return temp;
		}

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}

	static void printListRecursively(Node head) {
		if (head == null)
			return;

		System.err.print(head.data + " ");
		printListRecursively(head.next);

	}

	public static void main(String[] args) {
		Node head = null;
		head = insertAtEnd(head, 1);
		head = insertAtEnd(head, 2);
		head = insertAtEnd(head, 3);
		head = insertAtEnd(head, 4);
		head = insertAtEnd(head, 5);

		System.err.print("The List is : ");
		printListRecursively(head);

		head = insertElemAtGivenPosition(head, 4, 0);
		System.err.print("\nThe New List is : ");
		printListRecursively(head);
	}

	static Node insertElemAtGivenPosition(Node head, int pos, int elem) {

		Node temp = new Node(elem);
		if (pos == 1) {
			temp.next = head;
			return temp;
		}

		Node curr = head;
		for (int i = 1; i <= pos - 2 && curr != null; i++) {
			curr = curr.next;
		}
		if (curr == null) {
			return head;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;
	}
}
