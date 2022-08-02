package gfg.tree;

import java.util.List;

public class PostorderTraversalBinaryTreeIterative {
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

		List<Integer> preOrder = preOrder(root);
		System.err.println(preOrder);

	}

	public static List<Integer> preOrder(Node root) {
		// TODO
		return null;

	}
}
