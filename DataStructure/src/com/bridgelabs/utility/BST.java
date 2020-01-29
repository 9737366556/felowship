package com.bridgelabs.utility;



/**
 * Purpose :To Search and Store the data into data Structure 
 * 			To reuse the code
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class BST {
	// node class 
	class Node {
		// propertys for tree
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	public BST() {
		root = null;
	}
	
	public Node search(Node root, int key) 
	{ 
	    // Base Cases: root is null or key is present at root 
	    if (root==null || root.key==key) 
	        return root; 
	  
	    // val is greater than root's key 
	    if (root.key > key) 
	        return search(root.left, key); 
	  
	    // val is less than root's key 
	    return search(root.right, key); 
	} 

	// This method mainly calls insertRec()
	public void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	// This method mainly calls InorderRec()
	public void show() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}
       
    /* Function to get the count of leaf nodes in a binary tree*/
    public int getLeafCount()  
    { 
        return getLeafCount(root); 
    } 
   
    int getLeafCount(Node node)  
    { 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return 1; 
        else
            return getLeafCount(node.left) + getLeafCount(node.right); 
    } 

}
