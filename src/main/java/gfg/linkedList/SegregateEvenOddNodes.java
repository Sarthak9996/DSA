package gfg.linkedList;

public class SegregateEvenOddNodes {
	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

	static void printList(Node head) {
		if(head == null) {
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.err.print(temp.data+" " );
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(15);
		head.next.next.next = new Node(20);

		System.err.print("The list is : ");
		printList(head);

		head = evenOddSeparated(head);

		System.err.print("\nThe new list is : ");
		printList(head);

	}

	static Node evenOddSeparated(Node head) {
		Node eS = null, eE = null, oS = null, oE = null;
		for (Node curr = head; curr != null; curr = curr.next) {
			int num = curr.data;
			if (num % 2 == 0) {
				if (eS == null) {
					eS = curr;
					eE = eS;
				} else {
					eE.next = curr;
					eE = eE.next;
				}
			} else {
				if (oS == null) {
					oS = curr;
					oE = oS;
				} else {
					oE.next = curr;
					oE = oE.next;
				}
			}
		}
		if (oS == null || eS == null) {
			return head;
		}
		eE.next = oS;
		oE.next = null;

		return eS;
	}

}
