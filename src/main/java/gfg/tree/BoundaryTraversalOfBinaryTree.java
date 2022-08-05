package gfg.tree;

import java.util.ArrayList;

public class BoundaryTraversalOfBinaryTree {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int x) {
			data = x;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);

		root.left.left = new Node(4);
		root.left.right = new Node(5);

		root.left.right.left = new Node(6);

		root.right.left = new Node(7);
		root.right.right = new Node(8);

		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);

		ArrayList<Integer> printBoundary = printBoundary(root);
		System.err.println(printBoundary);
	}

	static ArrayList<Integer> printBoundary(Node root) {
		ArrayList<Integer> bt = new ArrayList<Integer>();

		if (!isLeafNode(root))
			bt.add(root.data);

		addLeftBoundary(root, bt);
		addLeaves(root, bt);
		addRightBoundary(root, bt);
		return bt;
	}

	static Boolean isLeafNode(Node root) {
		if (root.left == null && root.right == null) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	static void addLeftBoundary(Node root, ArrayList<Integer> bt) {
		Node curr = root.left;
		while (curr != null) {
			if (!isLeafNode(curr))
				bt.add(curr.data);
			if (curr.left != null)
				curr = curr.left;
			else
				curr = curr.right;
		}
	}

	static void addLeaves(Node root, ArrayList<Integer> bt) {
		if (isLeafNode(root)) {
			bt.add(root.data);
			return;
		}
		if (root.left != null)
			addLeaves(root.left, bt);
		if (root.right != null)
			addLeaves(root.right, bt);
	}

	static void addRightBoundary(Node root, ArrayList<Integer> bt) {
		Node curr = root.right;
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		while (curr != null) {
			if (!isLeafNode(curr)) {
				tmp.add(curr.data);
			}
			if (curr.right != null)
				curr = curr.right;
			else
				curr = curr.left;
		}

		for (int i = tmp.size() - 1; i >= 0; i--) {
			bt.add(tmp.get(i));
		}
	}
}
