package gfg.linkedList;

public class ReverseALinkedListSingly {

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

		head = reverse(head);

		System.err.print("\nThe reversed List is : ");
		printListRecursively(head);

	}

	static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
}
