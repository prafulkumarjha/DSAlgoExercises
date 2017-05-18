package com.practice.trees.services;

import com.practice.node.TreeNode;

public class TreePathSum {

	TreeNode root = null;

	public TreePathSum(TreeNode root) {
		super();
		this.root = root;
	}
	
	public int getTreePathSum(TreeNode node, int val) {
	
		if(node == null) 
			return 0;
		
		val = val*10 + node.data;
		System.out.println("val "+val);
		
		if(node.left == null && node.right == null)
			return val;
		return getTreePathSum(node.left, val) + getTreePathSum(node.right, val);
		
		
		
	}
	
	
}
