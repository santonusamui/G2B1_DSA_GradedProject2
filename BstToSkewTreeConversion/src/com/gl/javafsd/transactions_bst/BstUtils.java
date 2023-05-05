package com.gl.javafsd.transactions_bst;

import java.util.LinkedList;

public class BstUtils {

	LinkedList<Integer> nodeAscending = new LinkedList<>();

	public LinkedList<Integer> inorder(Node root) {

		if (root == null)
			return this.nodeAscending;
		else {
			inorder(root.left);
			this.nodeAscending.add(root.data);
			inorder(root.right);
		}

		return this.nodeAscending;

	}

	public void inorderPrint(Node root) {

		if (root == null)
			return;
		else {
			inorderPrint(root.left);
			System.out.print(root.data + ", ");
			inorderPrint(root.right);
		}
	}

	public void preorderPrint(Node root) {

		if (root == null)
			return;
		else {
			System.out.print(root.data + ", ");
			preorderPrint(root.left);
			preorderPrint(root.right);
		}
	}

	public void postorderPrint(Node root) {

		if (root == null)
			return;
		else {

			postorderPrint(root.left);
			postorderPrint(root.right);
			System.out.print(root.data + ", ");
		}

	}

}
