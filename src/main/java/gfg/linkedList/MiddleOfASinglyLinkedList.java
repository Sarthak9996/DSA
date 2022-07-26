package gfg.linkedList;

public class MiddleOfASinglyLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	static void printListRecursively(Node head) {

		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printListRecursively(head.next);
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node temp1 = new Node(2);
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;

		System.err.print("\nThe List is : ");
		printListRecursively(head);

		System.err.println("\nMiddle Element is : " + middleElement(head));
	}

	static Integer middleElement(Node head) {
		if (head == null)
			return -1;

		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

}
