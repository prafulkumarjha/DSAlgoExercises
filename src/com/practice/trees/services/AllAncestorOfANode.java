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
		if(node.data == itemNode.data) 
			return true;
			///System.out.println("7 node");
		if( printAllAncestor(node.left, itemNode) ) {
			System.out.print(node.data+" ");
			return true;
		}
		
		if( printAllAncestor(node.right, itemNode) ) {
			System.out.print(node.data+" ");
			return true;
		}
		return false;
	}
}
