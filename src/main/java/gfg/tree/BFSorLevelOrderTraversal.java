package gfg.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSorLevelOrderTraversal {
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

		List<List<Integer>> levelOrder = levelOrder(root);
		System.err.println(levelOrder);

	}

	public static List<List<Integer>> levelOrder(Node root) {
		Queue<Node> queue = new ArrayDeque<Node>();
		List<List<Integer>> allList = new ArrayList<List<Integer>>();
		if (root == null)
			return allList;
		queue.offer(root);
		while (!queue.isEmpty()) {
			int sizeLevel = queue.size();
			List<Integer> subList = new ArrayList<Integer>();

			for (int i = 0; i < sizeLevel; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				subList.add(queue.poll().data);
			}
			allList.add(subList);
		}
		return allList;
	}
}
