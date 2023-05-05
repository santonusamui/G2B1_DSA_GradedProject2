package com.gl.javafsd.skewtree;

import java.util.Iterator;
import java.util.LinkedList;

public class SkewTree {

	LinkedList<Integer> nodeAscending = new LinkedList<>();
	Iterator<Integer> itr = nodeAscending.iterator();
	SkewNode root = null;

	public SkewTree(LinkedList<Integer> nodeAscending) {

		this.nodeAscending = nodeAscending;

	}

	public SkewNode getRoot() {
		return root;
	}

	public void setRoot(SkewNode root) {
		this.root = root;
	}

	public void helperOfRightSkew(Iterator<Integer> itr, SkewNode root) {

		while (itr.hasNext()) {

			int data = itr.next();
			root = insertRightSkew(root, data);

		}
	}

	public SkewNode insertRightSkew(SkewNode root, int data) {

		if (root == null) {
			root = new SkewNode(data);

			this.root = root;
			return root;
		} else {
			SkewNode newNode = new SkewNode(data);
			root.right = newNode;
			root = root.right;
			return root;
		}

	}

	public void rightSkewPreorderPrint(SkewNode root) {
		if (root == null)
			return;

		System.out.print(root.data + ",  ");
		rightSkewPreorderPrint(root.left);
		rightSkewPreorderPrint(root.right);

	}

	public void rightSkewInorderPrint(SkewNode root) {
		if (root == null)
			return;

		rightSkewInorderPrint(root.left);
		System.out.print(root.data + ",  ");
		rightSkewInorderPrint(root.right);

	}

	public void rightSkewPostorderPrint(SkewNode root) {
		if (root == null)
			return;

		rightSkewPostorderPrint(root.left);
		rightSkewPostorderPrint(root.right);
		System.out.print(root.data + ",  ");

	}

}
