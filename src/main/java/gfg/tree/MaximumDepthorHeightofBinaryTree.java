package gfg.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaximumDepthorHeightofBinaryTree {
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

		System.err.println("Height of the given tree is : " + height(root));
		System.err.println("Height of the given tree by bfs is : " + heightUsingBFSorIterative(root));

	}

	public static Integer height(Node root) {

		if (root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);

		return 1 + Math.max(lh, rh);

	}

	public static Integer heightUsingBFSorIterative(Node root) {
		if (root == null)
			return 0;

		Queue<Node> queue = new ArrayDeque<Node>();
		queue.offer(root);
		int height = 0;
		while (true) {
			int nodeCount = queue.size();
			if (nodeCount == 0) {
				return height;
			}
			height++;

			while (nodeCount > 0) {
				Node newNode = queue.peek();
				queue.poll();

				if (newNode.left != null) {
					queue.offer(newNode.left);
				}
				if (newNode.right != null) {
					queue.offer(newNode.right);
				}
				nodeCount--;
			}
		}
	}
}
