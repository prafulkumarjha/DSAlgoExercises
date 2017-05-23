package com.practice.trees.services;

import java.util.Stack;

import com.practice.node.TreeNode;

public class LCAOfTreeNodes {

	TreeNode root = null;

	public LCAOfTreeNodes(TreeNode root) {
		super();
		this.root = root;
	}
	
	Stack<TreeNode> path1 = new Stack<TreeNode>();
	Stack<TreeNode> path2 = new Stack<TreeNode>();
	
	public boolean getPath(TreeNode node, TreeNode targetNode, boolean isFirst) {
		
		if(node == null)
			return false;
		if(node == targetNode)
			return true;
		if(getPath(node.left, targetNode,isFirst)) {
			if(isFirst) {
				path1.push(node);
			} 
			else {
				path2.push(node);
			}
			return true;
		}
		
		if(getPath(node.right, targetNode, isFirst)) {
			if(isFirst) {
				path1.push(node);
			} 
			else {
				path2.push(node);
			}
		}
		return false;
	}
	public TreeNode getLCA(TreeNode node1, TreeNode node2,TreeNode node) {
		
		
		
		
		
		return null;
	}
}
