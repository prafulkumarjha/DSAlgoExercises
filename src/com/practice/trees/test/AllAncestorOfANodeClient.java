package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.AllAncestorOfANode;

public class AllAncestorOfANodeClient {

	
	public static void main(String args[]) {
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		//root.left.right.right = new TreeNode(14);
		//root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(7);
		
		AllAncestorOfANode ancestorNode = new AllAncestorOfANode(root);
		ancestorNode.printAllAncestor(root, root.right.right);
		
	}
}
