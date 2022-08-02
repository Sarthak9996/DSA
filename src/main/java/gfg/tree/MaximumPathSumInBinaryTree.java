package gfg.tree;

public class MaximumPathSumInBinaryTree {
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

		System.err.println("Maximum Path Sum of the Tree is : " + maxSum(root));

	}

	public static Integer maxSum(Node root) {
		int[] maxSum = new int[1];
		maxSum[0] = Integer.MIN_VALUE;
		dfsHeightSum(root, maxSum);
		return maxSum[0];
	}

	public static Integer dfsHeightSum(Node root, int[] maxSum) {
		if (root == null)
			return 0;

		int lh = Math.max(0, dfsHeightSum(root.left, maxSum));
		int rh = Math.max(0, dfsHeightSum(root.right, maxSum));

		maxSum[0] = Math.max(maxSum[0], lh + rh + root.data);

		return Math.max(lh, rh) + root.data;
	}
}
