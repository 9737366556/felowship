package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.BST;


/**
 * Purpose : To count the maximum number of leaf are created in binaryTree
 * 
 *  
 * @author Nikunj Balar
 *
 */
public class BinaryTree {
	public static void main(String[] args) {
		// creating BinarySearchTree object
		BST bst=new BST();
		// inserting data into tree
		bst.insert(30);
		bst.insert(10);
		bst.insert(60);
		bst.insert(5);
		bst.insert(70);
		bst.insert(20);
		bst.insert(40);
		bst.insert(50);

		// return number of leaf of binary tree
		System.out.println(bst.getLeafCount());
	}
}
