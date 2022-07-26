package gfg.linkedList.DoublyLinkedList;

public class InsertAtEndOfDoublyLinkedList {
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
		head = insertEnd(head, 1);
		head = insertEnd(head, 2);
		head = insertEnd(head, 3);
		head = insertEnd(head, 4);
		head = insertEnd(head, 5);

		System.err.print("The List is : ");
		printDLL(head);
	}

	static DNode insertEnd(DNode head, int x) {
		DNode temp = new DNode(x);

		if (head == null)
			return temp;

		DNode curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}

		curr.next = temp;
		temp.prev = curr;

		return head;
	}

	static void printDLL(DNode head) {
		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printDLL(head.next);
	}
}
