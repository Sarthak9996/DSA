package gfg.tree;

public class CheckIdenticalTree {
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

		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);

		root1.left.left = new Node(4);
		root1.left.right = new Node(5);

		root1.left.right.left = new Node(6);

		root1.right.left = new Node(7);
		root1.right.right = new Node(8);

		root1.right.right.left = new Node(9);
		root1.right.right.right = new Node(10);

		System.err.println("Are Trees Same : " + isIdentical(root, root1));

	}

	public static Boolean isIdentical(Node p, Node q) {

		if (p == null || q == null) {
			return (p == q);
		}

		return (p.data == q.data) && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
	}

}
