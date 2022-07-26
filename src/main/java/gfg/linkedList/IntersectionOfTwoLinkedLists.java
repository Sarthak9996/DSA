package gfg.linkedList;

public class IntersectionOfTwoLinkedLists {
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
		Node temp = head;
		while (temp != null) {
			System.err.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(5);
		head.next.next = new Node(15);
		head.next.next.next = new Node(20);

		Node head1 = new Node(25);
		head1.next = new Node(15);
		head1.next.next = new Node(20);

		System.err.print("The first list is : ");
		printList(head);

		System.err.print("\nThe second list is : ");
		printList(head1);

		System.err.println("\nIntersection is at node having value : " + getNode(head, head1));

	}

	static Integer getNode(Node head1, Node head2) {
		int c1 = getCount(head1);
		int c2 = getCount(head2);

		if (c1 > c2) {
			int d = c1 - c2;
			return getIntersection(head1, head2, d);
		} else {
			int d = c2 - c1;
			return getIntersection(head2, head1, d);

		}
	}

	static Integer getCount(Node head) {
		int result = 0;

		Node curr = head;
		while (curr != null) {
			result++;
			curr = curr.next;
		}
		return result;
	}

	static Integer getIntersection(Node head1, Node head2, int d) {
		int i;
		Node cur = head1;
		Node cur1 = head2;
		for (i = 0; i < d; i++) {
			if (cur == null) {
				return -1;
			}
			cur = cur.next;
		}

		while (cur != null && cur1 != null) {
			if (cur.data == cur1.data) {
				return cur.data;
			}
			cur = cur.next;
			cur1 = cur1.next;
		}
		return -1;
	}

}
