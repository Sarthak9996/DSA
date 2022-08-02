package gfg.tree;

public class DiameterOfBinaryTree {
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

		System.err.println("Diameter of the Tree is : " + diameter(root));

	}

	public static Integer diameter(Node root) {
		int[] diameter = new int[1];
		dfsHeight(root, diameter);
		return diameter[0];
	}

	public static Integer dfsHeight(Node root, int[] diameter) {
		if (root == null)
			return 0;
		int lh = dfsHeight(root.left, diameter);
		int rh = dfsHeight(root.right, diameter);

		diameter[0] = Math.max(diameter[0], lh + rh);

		return Math.max(lh, rh) + 1;
	}
}
