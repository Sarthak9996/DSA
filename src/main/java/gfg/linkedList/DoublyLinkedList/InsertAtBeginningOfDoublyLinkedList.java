package gfg.linkedList.DoublyLinkedList;

public class InsertAtBeginningOfDoublyLinkedList {
	static class DNode {
		int data;
		DNode prev;
		DNode next;

		DNode(int x) {
			data = x;
			prev = null;
			next = null;
		}
	}

	public static void main(String[] args) {
		DNode head = null;
		head = insertBegin(head, 1);
		head = insertBegin(head, 2);
		head = insertBegin(head, 3);
		head = insertBegin(head, 4);
		head = insertBegin(head, 5);

		System.err.print("The List is : ");
		printDLL(head);
	}

	static DNode insertBegin(DNode head, int x) {
		DNode temp = new DNode(x);

		temp.next = head;
		if (head != null)
			head.prev = temp;
		return temp;
	}

	static void printDLL(DNode head) {
		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printDLL(head.next);
	}
}
