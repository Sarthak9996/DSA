package gfg.linkedList.CircularLinkedList;

public class InsertAtEndOfCircularLinkedList {
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

		head = insertEnd(head, 1);

		System.err.print("\nThe new list is : ");
		printDLL(head);

		head = insertEndEfficient(head, 1);

		// One extra element will be added now because new list is used as head
		System.err.print("\nThe new list by efficient method is : ");
		printDLL(head);

	}

	static Node insertEnd(Node head, int x) {
		Node temp = new Node(x);

		if (head == null) {
			temp.next = temp;
			return temp;
		}
		Node curr = head;
		while (curr.next != head) {
			curr = curr.next;
		}
		curr.next = temp;
		temp.next = head;

		return head;
	}

	static Node insertEndEfficient(Node head, int x) {
		Node temp = new Node(x);

		if (head == null) {
			temp.next = temp;
			return temp;
		}
		temp.next = head.next;
		head.next = temp;
		temp.data = head.data;
		head.data = x;
		return temp;

	}
}
