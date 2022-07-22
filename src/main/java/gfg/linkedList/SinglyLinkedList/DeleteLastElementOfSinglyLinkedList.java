package gfg.linkedList.SinglyLinkedList;

public class DeleteLastElementOfSinglyLinkedList {
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

		System.err.print("The Old List is : ");
		printListRecursively(head);

		head = deleteEnd(head);
		System.err.println("\nNew Head : " + head.data);

		System.err.print("The List is : ");
		printListRecursively(head);
	}

	static Node deleteEnd(Node head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return null;
		}
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = null;

		return head;
	}

	static void printListRecursively(Node head) {

		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printListRecursively(head.next);
	}
}
