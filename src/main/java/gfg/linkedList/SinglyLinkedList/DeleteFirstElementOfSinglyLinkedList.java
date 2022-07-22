package gfg.linkedList.SinglyLinkedList;

public class DeleteFirstElementOfSinglyLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(3);

		head.next = temp1;
		temp1.next = temp2;

		head = deleteHead(head);
		System.err.println("New Head : " + head.data);

		System.err.print("The List is : ");
		printListRecursively(head);
	}

	static Node deleteHead(Node head) {
		if (head == null) {
			return null;
		} else {
			return head.next;
		}
	}

	static void printListRecursively(Node head) {

		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printListRecursively(head.next);
	}
}
