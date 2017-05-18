package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.CountLeafNode;

public class CountLeafNodeClient {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		//root.left.right.right = new TreeNode(14);
		//root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(7);
		
		CountLeafNode countLeafNode = new CountLeafNode(root);
		System.out.println("Recursive count leaf nodes gives : "+countLeafNode.getLeafCountRecursive(root));
		System.out.println("Non-Recursive count leaf nodes gives : "+countLeafNode.getLeafCount(root));
	}
}
