package gfg.tree;

public class CheckBalancedBinaryTree {
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

		System.err.println("IS TREE BALANCED : " + isBalanced(root));

	}

	public static Boolean isBalanced(Node root) {

		return !(dfsHeight(root) == -1);
	}

	public static Integer dfsHeight(Node root) {
		if (root == null)
			return 0;
		int lh = dfsHeight(root.left);
		int rh = dfsHeight(root.right);

		if (lh == -1 || rh == -1)
			return -1;

		if (Math.abs(lh - rh) > 1)
			return -1;

		return Math.max(lh, rh) + 1;
	}
}
