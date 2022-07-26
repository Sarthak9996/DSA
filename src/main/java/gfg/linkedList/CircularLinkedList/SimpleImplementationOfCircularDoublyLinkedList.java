package gfg.linkedList.CircularLinkedList;

public class SimpleImplementationOfCircularDoublyLinkedList {

	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int x) {
			data = x;
			prev = null;
			next = null;
		}
	}

	static void printList(Node head) {
		if (head == null)
			return;
		Node curr = head;
		do {
			System.err.print(curr.data + " ");
			curr = curr.next;
		} while (curr != head);
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);

		head.next = temp1;
		head.prev = temp2;
		temp1.next = temp2;
		temp1.prev = head;
		temp2.next = head;
		temp2.prev = temp1;

		System.err.print("The list is : ");
		printList(head);

		head = insertAtBegin(head, 0);

		System.err.print("\nThe new list is : ");
		printList(head);
		
		head = insertAtBegin(head, 1);

		System.err.print("\nThe new list is : ");
		printList(head);
	}

	static Node insertAtBegin(Node head, int x) {
		Node temp = new Node(x);
		if (head == null) {
			temp.next = temp;
			temp.prev = temp;
			return temp;
		}
		temp.prev = head.prev;
		temp.next = head;
		head.prev.next = temp;
		head.prev = temp;

		return temp;
	}
}
