package com.gl.javafsd.transactions_bst;

public class Node {

	int data;
	Node left;
	Node right;
	int height;

	public Node(int data) {

		this.data = data;
		this.left = null;
		this.right = null;
		// considering as there is no edge, hence no child
		this.height = 0;
	}

}
