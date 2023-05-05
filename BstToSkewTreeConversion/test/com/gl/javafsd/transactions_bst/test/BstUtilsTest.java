package com.gl.javafsd.transactions_bst.test;

import com.gl.javafsd.transactions_bst.BstAvl;
import com.gl.javafsd.transactions_bst.BstUtils;
import com.gl.javafsd.transactions_bst.Node;

public class BstUtilsTest {

	public static void main(String[] args) {

		Node root = null;
		BstAvl tree = new BstAvl();

//		root = tree.insert(root, 15);
//		root = tree.insert(root, 10);
//		root = tree.insert(root, 5);
//		root = tree.insert(root, 11);

		root = tree.insert(root, 50);
		root = tree.insert(root, 20);
		root = tree.insert(root, 11);
		root = tree.insert(root, 30);
		root = tree.insert(root, 60);
		root = tree.insert(root, 10);
		root = tree.insert(root, 55);
		root = tree.insert(root, 57);
		root = tree.insert(root, 58);
		root = tree.insert(root, 59);
		root = tree.insert(root, 56);
		root = tree.insert(root, 56);

		BstUtils util = new BstUtils();

		// Bst_Avl tree print
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

	}

}
