package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.TreePathSum;

public class TreePathSumClient {

public static void main(String args[]) {
		
		TreeNode root = new TreeNode(6); 
		root.left = new TreeNode(3);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		//root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(4);
		
		TreePathSum pathSum = new TreePathSum(root);
		System.out.println("Tree All possible path sum : "+pathSum.getTreePathSum(root, 0));
		
	}

}
