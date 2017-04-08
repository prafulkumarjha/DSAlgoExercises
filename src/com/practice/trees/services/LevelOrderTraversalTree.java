package com.practice.trees.services;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.node.TreeNode;

/**
 * @author Praful Jha
 *
 */
public class LevelOrderTraversalTree {

	TreeNode root = null;
	
	public LevelOrderTraversalTree(TreeNode root) {
		this.root = root;
	}
	
	public void levelOrderTree() {
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		Q.add(root);
		TreeNode temp_node;
		
		while(!Q.isEmpty()) {
			temp_node = Q.remove();
			System.out.print(temp_node.data+" ");
			if(temp_node != null && temp_node.left != null)
				Q.add(temp_node.left);
			if(temp_node !=null && temp_node.right != null)
				Q.add(temp_node.right);
		}
	}
}
