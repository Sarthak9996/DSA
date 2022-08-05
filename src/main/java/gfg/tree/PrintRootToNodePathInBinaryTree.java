package gfg.tree;

import java.util.ArrayList;

public class PrintRootToNodePathInBinaryTree {
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

		root.right.right = new Node(7);

		root.left.right.left = new Node(6);

		int num = 6;
		ArrayList<Integer> pathToNode = path(root, num);
		System.err.println("Path is : " + pathToNode);
	}

	static ArrayList<Integer> path(Node root, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (root == null) {
			return result;
		}

		Boolean path = getPath(root, result, k);
		System.err.println("Is path present : " + path);
		return result;
	}

	static Boolean getPath(Node root, ArrayList<Integer> ar, int k) {
		if (root == null)
			return Boolean.FALSE;

		ar.add(root.data);
		if (root.data == k) {
			return Boolean.TRUE;
		}

		if (getPath(root.left, ar, k) || getPath(root.right, ar, k)) {
			return Boolean.TRUE;
		}

		ar.remove(ar.size() - 1);
		return Boolean.FALSE;
	}

}
