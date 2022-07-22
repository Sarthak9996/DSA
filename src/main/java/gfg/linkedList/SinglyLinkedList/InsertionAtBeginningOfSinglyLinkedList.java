package gfg.linkedList.SinglyLinkedList;

public class InsertionAtBeginningOfSinglyLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	static Node insertAtBegin(Node head, int x) {
		Node temp = new Node(x);
		temp.next = head;
		return temp;
	}

	public static void main(String[] args) {
		Node head = null;
		head = insertAtBegin(head, 1);
		head = insertAtBegin(head, 2);
		head = insertAtBegin(head, 3);

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
