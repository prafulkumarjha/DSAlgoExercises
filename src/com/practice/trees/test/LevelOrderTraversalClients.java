package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.LevelOrderTraversalTree;

/**
 * @author Praful Jha
 *
 */
public class LevelOrderTraversalClients {

public static void main(String args[]) {
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(25);
		
		LevelOrderTraversalTree levelOrder = new LevelOrderTraversalTree(root);
		levelOrder.levelOrderTree();
}
}
