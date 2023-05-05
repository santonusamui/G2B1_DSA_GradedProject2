package com.gl.javafsd.transactions_bst;

public class BstAvl {

	public Node root;

	int max(int a, int b) {
		return (a > b) ? a : b;
	}

	int getHeight(Node n) {

		if (n == null) {
			return 0;
		} else {
			int leftHeight = getHeight(n.left);
			int rightHeight = getHeight(n.right);
			int finalHeight = max(leftHeight, rightHeight) + 1;
			return finalHeight;
		}
	}

	int getBalanceFactor(Node n) {
		if (n == null)
			return -1;

		return (getHeight(n.left) - getHeight(n.right));

	}

	// RR scenario
	Node rightRotation(Node a) {

		Node b = a.left; // left child of target node,a, where balance factor violation, occurred
		Node br = b.right; // right child of node,b
		b.right = a;
		a.left = br;
		a.height = max(getHeight(a.left), getHeight(a.right)) + 1;
		b.height = max(getHeight(b.left), getHeight(b.right)) + 1;
		return b;
	}

	// LL scenario
	Node leftRotation(Node a) {

		Node b = a.right; // right child of target node,a, where balance factor violation, occurred
		Node bl = b.left; // left child of node,b
		b.left = a;
		a.right = bl;
		a.height = max(getHeight(a.left), getHeight(a.right)) + 1;
		b.height = max(getHeight(b.left), getHeight(b.right)) + 1;
		return b;
	}

	public Node insert(Node root, int value) {
		if (root == null) {
			return new Node(value);
		} else if (value < root.data) {
			root.left = insert(root.left, value);
		} else if (value > root.data) {
			root.right = insert(root.right, value);
		} else {
			return root;
		}

		root.height = max(getHeight(root.left), getHeight(root.right)) + 1;
		int bf = getBalanceFactor(root);

		// LL Scenario
		if (bf > 1 && value < root.left.data) {
			return rightRotation(root);
		}
		// RR Scenario
		if (bf < -1 && value > root.right.data) {
			return leftRotation(root);
		}
		// LR Scenario
		if (bf > 1 && value > root.left.data) {
			root.left = leftRotation(root.left);
			return rightRotation(root);

		}
		// RL Scenario
		if (bf < -1 && value < root.right.data) {
			root.right = rightRotation(root.right);
			return leftRotation(root);
		}

		return root;

	}

}
