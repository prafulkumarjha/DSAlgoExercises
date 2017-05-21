package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.MaxElementBinaryTree;


/**
 * @author Praful Jha
 *
 */
public class MaxElementBinaryTreeClient {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(7);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		//root.left.right.right = new TreeNode(14);
		//root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(2);
		
		MaxElementBinaryTree treeService = new MaxElementBinaryTree(root);
		System.out.println("max element of tree is : "+treeService.findMaxElement());
		System.out.println("max element of tree is : "+treeService.findMaxElementRecursion(root));
		System.out.println("max element of tree is : "+treeService.findMaxElementRecursion2(root));
	}
}
