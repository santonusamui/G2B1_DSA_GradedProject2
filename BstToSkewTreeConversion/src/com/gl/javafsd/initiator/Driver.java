package com.gl.javafsd.initiator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.gl.javafsd.skewtree.SkewTree;
import com.gl.javafsd.transactions_bst.BstAvl;
import com.gl.javafsd.transactions_bst.BstUtils;
import com.gl.javafsd.transactions_bst.Node;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the total numbers of Nodes to be inserted into the BST Tree: ");
		int noOfNodes = scan.nextInt();
		int[] treeNodes = new int[noOfNodes];

		Node root = null;
		BstAvl tree = new BstAvl();

		// Accepting user value for Nodes of the tree
		for (int i = 0; i < noOfNodes; i++) {

			int no = i;
			System.out.println("Enter the value for BST Node:" + ++no);
			int nodeValue = scan.nextInt();
			treeNodes[i] = nodeValue;
		}

		// Insertion into tree
		for (int i = 0; i <= treeNodes.length - 1; i++) {

			root = tree.insert(root, treeNodes[i]);
		}
		scan.close();

		BstUtils util = new BstUtils();
		LinkedList<Integer> ascTreeValue = util.inorder(root);
		Iterator<Integer> itr = ascTreeValue.iterator();

		System.out.println();
		System.out.println("The Inorder Traversal of the Complete BST Tree :");
		System.out.println();

		util.inorderPrint(root);

		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("The Preorder Traversal of the Complete BST Tree :");
		System.out.println();

		util.preorderPrint(root);

		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("The Postorder Traversal of the Complete BST Tree :");
		System.out.println();

		util.postorderPrint(root);

		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");

		System.out.println();
		System.out.println();

		SkewTree skewTree = new SkewTree(ascTreeValue);
		skewTree.helperOfRightSkew(itr, skewTree.getRoot());

		System.out.println("Conversion done from Complete BST Tree to Skewed Tree, as follows:");
		System.out.println();

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
