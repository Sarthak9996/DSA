package gfg.linkedList;

public class ReverseALinkedListInGroupsOfSizeK {

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
		Node temp2 = new Node(3);
		Node temp3 = new Node(4);
		Node temp4 = new Node(5);
		Node temp5 = new Node(6);

		head.next = temp1;
		temp1.next = temp2;
		temp2.next = temp3;
		temp3.next = temp4;
		temp4.next = temp5;

		System.err.print("\nThe List is : ");
		printList(head);

		int k = 3;
		head = reverseK(head, k);

		System.err.print("\nThe new List is : ");
		printList(head);

	}

	static Node reverseK(Node head, int k) {
		Node curr = head, prev_first = null;
		Boolean isFirstPass = true;

		while (curr != null) {
			Node first = curr, prev = null;
			int count = 0;
			while (curr != null && count < k) {
				Node next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
				count++;
			}
			if (isFirstPass) {
				head = prev;
				isFirstPass = false;
			} else {
				prev_first.next = prev;
			}
			prev_first = first;
		}
		return head;
	}
}
