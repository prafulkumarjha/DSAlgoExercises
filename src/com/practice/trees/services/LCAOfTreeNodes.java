package com.practice.trees.services;

import java.util.Stack;

import com.practice.node.TreeNode;

public class LCAOfTreeNodes {

	TreeNode root = null;

	public LCAOfTreeNodes(TreeNode root) {
		super();
		this.root = root;
	}
	
	Stack<TreeNode> path1 = new Stack<>();
	Stack<TreeNode> path2 = new Stack<>();
	
	public boolean getPath(TreeNode node, int target, boolean isFirst) {
		
		if(node == null)
			return false;
		if(node.data == target){
			if(isFirst) {
				path1.push(node);
			} 
			else {
				path2.push(node);
			}
			return true;
		}
		if(getPath(node.left, target,isFirst)) {
			if(isFirst) {
				path1.push(node);
			} 
			else {
				path2.push(node);
			}
			return true;
		}
		
		if(getPath(node.right, target, isFirst)) {
			if(isFirst) {
				path1.push(node);
			} 
			else {
				path2.push(node);
			}
			return true;
		}
		return false;
	}
	public TreeNode getLCA(int target2, int target1,TreeNode node) {
		
		
		getPath(node, target1, true);
		getPath(node, target2, false);
		
			if(path1.isEmpty())
				return null;
			if(path2.isEmpty()) 
				return null;
			TreeNode LCA_Node = null;
			while(!path1.isEmpty() && !path2.isEmpty()) {
				TreeNode temp_node1 = path1.pop();
				TreeNode temp_node2 = path2.pop();
				if(temp_node1 == temp_node2) 
					LCA_Node = temp_node1;
			}
		
		
		
		return LCA_Node;
	}
}
