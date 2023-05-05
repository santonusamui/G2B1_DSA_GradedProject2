package com.gl.javafsd.transactions_bst.test;

import java.util.Iterator;
import java.util.LinkedList;

import com.gl.javafsd.skewtree.SkewTree;
import com.gl.javafsd.transactions_bst.BstAvl;
import com.gl.javafsd.transactions_bst.BstUtils;
import com.gl.javafsd.transactions_bst.Node;

public class SkewTreeTest {

	public static void main(String[] args) {

		Node root = null;
		BstAvl tree = new BstAvl();

		root = tree.insert(root, 50);
		root = tree.insert(root, 20);
		root = tree.insert(root, 30);
		root = tree.insert(root, 60);
		root = tree.insert(root, 10);
		root = tree.insert(root, 55);
		root = tree.insert(root, 57);
		root = tree.insert(root, 15);

		BstUtils util = new BstUtils();
		LinkedList<Integer> ascTreeValue = util.inorder(root);
		Iterator<Integer> itr = ascTreeValue.iterator();

		SkewTree skewTree = new SkewTree(ascTreeValue);

		skewTree.helperOfRightSkew(itr, skewTree.getRoot());

		// Skewed tree print
		System.out.println("The Inorder Traversal of the Skewed Tree :");
		System.out.println();
		skewTree.rightSkewInorderPrint(skewTree.getRoot());
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("The Preorder Traversal of the Skewed Tree :");
		System.out.println();
		skewTree.rightSkewPreorderPrint(skewTree.getRoot());
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("The Postorder Traversal of the Skewed Tree :");
		System.out.println();
		skewTree.rightSkewPostorderPrint(skewTree.getRoot());

	}

}
