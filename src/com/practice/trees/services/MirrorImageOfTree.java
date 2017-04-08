package com.practice.trees.services;

import com.practice.node.TreeNode;

/**
 * @author Praful Jha
 *
 */
public class MirrorImageOfTree {

	TreeNode root = null;
	
	/**
	 * 
	 */
	public MirrorImageOfTree(TreeNode root) {
		// TODO Auto-generated constructor stub
		this.root = root; 
		
	}
	
	public TreeNode mirrorOfTree(TreeNode node) {
	
		if(node == null)
			return node;
		TreeNode left = mirrorOfTree(node.left);
		TreeNode right = mirrorOfTree(node.right);
		
		node.left = right;
		node.right = left;
		
		return node;
		
	}
	
	public void inOrder(TreeNode node) {
		
		if (node == null) 
			return ;
					
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
		
	}
	
}
