package gfg.linkedList;

//Use of Floyd Cycle Detection Algorithm
public class DetectAndRemoveLoop {

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
		temp5.next = temp2;

//		System.err.print("\nThe List is : ");
//		printList(head);

		head = detectCycleRemove(head);

		System.err.print("The new List is : ");
		printList(head);

	}

	static Node detectCycleRemove(Node head) {
		Node slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if (slow != fast)
			return head;
		slow = head;
		while (slow.next != fast.next) {
			slow = slow.next;
			fast = fast.next;
		}
		fast.next = null;
		return head;
	}
}
