package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.LevelOrderTraversalTree;
import com.practice.trees.services.TreeTraversalService;

/**
 * @author Praful Jha
 *
 */
public class TreeTraversalClient {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println("PreOrder : ");
		TreeTraversalService traversalService = new TreeTraversalService(root);
		traversalService.preOrder();
		
		System.out.println("Level Order : ");
		LevelOrderTraversalTree levelOrder = new LevelOrderTraversalTree(root);
		levelOrder.levelOrderTree();
	
		System.out.println();
		System.out.println("InOrder : ");
		traversalService.inOrder();
		System.out.println("PostOrder : ");
		System.out.println(traversalService.postOrder().toString());
}
}