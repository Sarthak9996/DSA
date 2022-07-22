package gfg.linkedList.SinglyLinkedList;

public class SearchInLinkedList {
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

		int num = 3;
		System.err.println("\nPosition of " + num + " by Iterative is at : " + searchIterative(head, num));
		System.err.println("Position of " + num + " by Recursive is at : " + searchRecursive(head, num));
	}

	static Integer searchIterative(Node head, int num) {
		int p = 1;
		Node curr = head;
		while (curr != null) {
			if (curr.data == num) {
				return p;
			} else {
				p++;
				curr = curr.next;
			}
		}
		return -1;
	}

	static Integer searchRecursive(Node head, int num) {
		if (head == null)
			return -1;
		if (head.data == num)
			return 1;
		else {
			int result = searchRecursive(head.next, num);
			if (result == -1)
				return -1;
			else
				return result + 1;
		}
	}
}
