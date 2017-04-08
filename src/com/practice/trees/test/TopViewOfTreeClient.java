package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.TopViewTree;

/**
 * @author Praful Jha
 *
 */
public class TopViewOfTreeClient {

public static void main(String args[]) {
		
	/*	TreeNode root = new TreeNode(1);
		root.left = new TreeNode(8);
		root.right = new TreeNode(22);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		root.left.right.left = new TreeNode(10);
		root.left.right.right = new TreeNode(14);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(25); */
	TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.left.right.right = new TreeNode(5);
    root.left.right.right.right = new TreeNode(6);
		TopViewTree topView = new TopViewTree(root);
		topView.topViewOfTree();
}
}
