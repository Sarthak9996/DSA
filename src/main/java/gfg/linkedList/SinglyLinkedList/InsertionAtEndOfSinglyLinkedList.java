package gfg.linkedList.SinglyLinkedList;

public class InsertionAtEndOfSinglyLinkedList {

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

		if (head == null)
			return temp;

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = temp;
		return head;
	}

	public static void main(String[] args) {
		Node head = null;
		head = insertAtEnd(head, 1);
		head = insertAtEnd(head, 2);
		head = insertAtEnd(head, 3);

		System.err.print("The List is : ");
		printListRecursively(head);
	}

	static void printListRecursively(Node head) {

		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printListRecursively(head.next);
	}

}
