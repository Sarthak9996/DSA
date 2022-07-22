package gfg.linkedList.SinglyLinkedList;

public class SimpleImplementationofLinkedList {

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

		printList(head);
		System.err.print("\nThe List recursively is : ");
		printListRecursively(head);
	}

	static void printList(Node head) {
		System.err.print("The List is : ");
		Node curr = head;
		while (curr != null) {
			System.err.print(curr.data + " ");
			curr = curr.next;
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
