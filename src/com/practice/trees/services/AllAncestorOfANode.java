package com.practice.trees.services;

import com.practice.node.TreeNode;;

public class AllAncestorOfANode {

	TreeNode  root = null;

	public AllAncestorOfANode(TreeNode root) {
		super();
		this.root = root;
	}
	
	public boolean printAllAncestor(TreeNode node, TreeNode itemNode) {
		
		//System.out.println("ItemNode "+itemNode.data);
		
		if(node == null) 
			return false;
		if(node.data == 7)
			System.out.println("7 node");
		if(node.left == itemNode || node.right == itemNode || 
				printAllAncestor(node.left, itemNode) || printAllAncestor(node.right, itemNode)) {
			System.out.print(node.data+" ");
			return true;
		}
		
		return false;
	}
}
