package gfg.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int x) {
			data = x;
		}
	}

	static class Pair<Node, Integer> {
		public final Node node;
		public final Integer hd;

		private Pair(Node node, Integer hd) {
			this.node = node;
			this.hd = hd;
		}

		public static <Node, Integer> Pair<Node, Integer> of(Node node, Integer hd) {
			return new Pair<>(node, hd);
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

		ArrayList<Integer> bottomView = bottomView(root);
		System.err.println(bottomView);

	}

	public static ArrayList<Integer> bottomView(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		Queue<Pair> que = new ArrayDeque<Pair>();
		que.add(new Pair(root, 0));

		while (!que.isEmpty()) {
			Pair it = que.poll();
			int hd = (int) it.hd;
			Node curr = (Node) it.node;

			map.put(hd, curr.data);
			if (curr.left != null) {
				que.add(new Pair(curr.left, hd - 1));
			}
			if (curr.right != null) {
				que.add(new Pair(curr.right, hd + 1));
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			result.add(entry.getValue());
		}

		return result;
	}
}
