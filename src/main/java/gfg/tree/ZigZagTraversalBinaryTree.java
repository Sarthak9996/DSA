package gfg.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagTraversalBinaryTree {
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

		List<List<Integer>> zigzag = zigzag(root);
		System.err.println(zigzag);
	}

	public static List<List<Integer>> zigzag(Node root) {
		List<List<Integer>> zigzag = new ArrayList<List<Integer>>();
		Queue<Node> que = new ArrayDeque<Node>();

		if (root == null)
			return zigzag;

		que.offer(root);
		Boolean flag = true;

		while (!que.isEmpty()) {
			int levelSize = que.size();
			List<Integer> subList = new ArrayList<Integer>();

			for (int i = 0; i < levelSize; i++) {
				Node newNode = que.peek();
				if (newNode.left != null) {
					que.offer(newNode.left);
				}
				if (newNode.right != null) {
					que.offer(newNode.right);
				}
				if (flag) {
					subList.add(que.poll().data);
				} else {
					subList.add(0, que.poll().data);
				}
			}

			flag = !flag;
			zigzag.add(subList);
		}

		return zigzag;
	}
}
