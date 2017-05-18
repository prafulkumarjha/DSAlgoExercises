package com.practice.trees.services;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.node.TreeNode;

public class CountLeafNode {

	TreeNode root = null;

	public CountLeafNode(TreeNode root) {
		super();
		this.root = root;
	}
	
	public int getLeafCountRecursive(TreeNode node) {
		
		if(node == null)
			return 0;
		
		if(node.right == null && node.left == null)
			return 1;
		
		return getLeafCountRecursive(node.left) + getLeafCountRecursive(node.right);
	}
	
	public int getLeafCount(TreeNode root) {
		
		int count = 0;
		
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		Q.add(root);
		
		while(!Q.isEmpty()) {
			
			TreeNode temp_node = Q.remove();
			
			if(temp_node.left == null && temp_node.right == null)
				count++;
			if(temp_node.left != null)
				Q.add(temp_node.left);
			if(temp_node.right != null)
				Q.add(temp_node.right);
		}
		
		
		return count;
	}
	
}
