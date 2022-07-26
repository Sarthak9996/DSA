package gfg.linkedList;

public class RemoveDuplicatesFromASortedSinglyLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	static void printList(Node head) {

		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printList(head.next);
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(2);
		Node temp3 = new Node(3);
		Node temp4 = new Node(3);
		Node temp5 = new Node(4);

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;

		System.err.print("\nThe List is : ");
		printList(head);

		head = removeDuplicates(head);

		System.err.print("\nThe new List is : ");
		printList(head);

	}

	static Node removeDuplicates(Node head) {
		Node curr = head;
		while (curr != null && curr.next != null) {
			if (curr.data == curr.next.data) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return head;
	}
}
