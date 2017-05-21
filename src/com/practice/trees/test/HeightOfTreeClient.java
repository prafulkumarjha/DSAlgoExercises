package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.TreeService;

/**
 * @author Praful Jha
 *
 */
public class HeightOfTreeClient {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(11);
		root.right.left = new TreeNode(6);
		//root.left.right.right = new TreeNode(14);
		//root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(7);
		
		TreeService treeService = new TreeService(root);
		System.out.println("Height of tree is "+treeService.heightOfTree(root));
	}
}
