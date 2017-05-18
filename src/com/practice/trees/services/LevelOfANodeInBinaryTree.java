package com.practice.trees.services;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.node.TreeNode;

public class LevelOfANodeInBinaryTree {

	TreeNode root = null;

	public LevelOfANodeInBinaryTree(TreeNode root) {
		super();
		this.root = root;
	}
	
	public int getLevelOfNode(int element) {
		
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		Q.add(root);
		int level = 0;
		
		while(true) {
			int level_node_count = Q.size();
			level++;
			while(level_node_count-- >0) {
				
				TreeNode temp_node = Q.remove();
				if(temp_node.data == element) {
					return level; 
				}
				if(temp_node.left != null)
					Q.add(temp_node.left);
				if(temp_node.right != null)
					Q.add(temp_node.right);
				
			}
			if(Q.isEmpty())
				return -1;
		}
	}
	
	
}
