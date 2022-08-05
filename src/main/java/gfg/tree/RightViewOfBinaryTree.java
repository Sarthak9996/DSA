package gfg.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightViewOfBinaryTree {
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

		ArrayList<Integer> rightViewOfBinaryTree = rightViewOfBinaryTree(root);
		System.err.println(rightViewOfBinaryTree);
	}

	static ArrayList<Integer> rightViewOfBinaryTree(Node root) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (root == null)
			return result;
		Queue<Node> que = new ArrayDeque<Node>();
		List<List<Integer>> mainList = new ArrayList<List<Integer>>();

		que.offer(root);

		while (!que.isEmpty()) {
			int levelSize = que.size();
			List<Integer> subList = new ArrayList<Integer>();
			for (int i = 0; i < levelSize; i++) {
				Node curr = que.peek();
				if (curr.left != null) {
					que.add(curr.left);
				}
				if (curr.right != null) {
					que.add(curr.right);
				}
				subList.add(que.poll().data);
			}
			mainList.add(subList);
		}

		for (List<Integer> i : mainList) {
			result.add(i.get(i.size() - 1));
		}

		return result;
	}

}
