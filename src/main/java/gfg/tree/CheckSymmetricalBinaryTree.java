package gfg.tree;

public class CheckSymmetricalBinaryTree {

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
		root.right = new Node(2);

		root.left.left = new Node(3);
		root.left.right = new Node(4);

		root.right.left = new Node(4);
		root.right.right = new Node(3);

		Boolean isSymmetrical = isSymmetrical(root);
		System.err.println("Binary tree is symmetrical : " + isSymmetrical);
	}

	static Boolean isSymmetrical(Node root) {

		if (root == null) {
			return Boolean.TRUE;
		}
		return isSymmetricalHelper(root.left, root.right);
	}

	static Boolean isSymmetricalHelper(Node left, Node right) {
		if (left == null || right == null) {
			return left == right;
		}
		if (left.data != right.data)
			return Boolean.FALSE;

		return (isSymmetricalHelper(left.left, right.right)) && (isSymmetricalHelper(left.right, right.left));
	}

}
