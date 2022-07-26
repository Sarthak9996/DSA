package gfg.linkedList;

public class SortedInsertInSinglyLinkedList {
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

		Node r = head;
		do {
			System.err.print(r.data + " ");
			r = r.next;
		} while (r != null);
	}

	public static void main(String[] args) {
		Node head = null;
		head = sortedInsert(head, 10);
		head = sortedInsert(head, 15);
		head = sortedInsert(head, 5);
		head = sortedInsert(head, 20);

		System.err.print("The list is : ");
		printList(head);

	}

	static Node sortedInsert(Node head, int x) {
		Node temp = new Node(x);
		if (head == null) {
			return temp;
		}
		if (x < head.data) {
			temp.next = head;
			return temp;
		}
		Node curr = head;
		while (curr.next != null && curr.next.data < x) {
			curr = curr.next;
		}
		temp.next = curr.next;
		curr.next = temp;
		return head;

	}

}
