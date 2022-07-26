package gfg.linkedList.DoublyLinkedList;

import gfg.linkedList.DoublyLinkedList.InsertAtBeginningOfDoublyLinkedList.DNode;

public class SimpleImplementationOfDoublyLinkedList {

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
		DNode head = new DNode(1);
		DNode temp1 = new DNode(2);
		DNode temp2 = new DNode(3);

		head.next = temp1;
		temp1.prev = head;
		temp1.next = temp2;
		temp2.prev = temp1;
		
		System.err.print("The list is : ");
		printDLL(head);
	}
	
	static void printDLL(DNode head) {
		if (head == null) {
			return;
		}
		System.err.print(head.data + " ");
		printDLL(head.next);
	}
}
