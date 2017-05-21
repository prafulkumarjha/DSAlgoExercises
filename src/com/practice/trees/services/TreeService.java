package com.practice.trees.services;

import java.util.Stack;

import com.practice.node.TreeNode;

/**
 * @author Praful Jha
 *
 */
public class TreeService {

	TreeNode root = null;
	static int size = 0;
	static int max_elem = Integer.MIN_VALUE;
	
	public TreeService(TreeNode root) {
		super();
		this.root = root;
	}
	/*
	 * Size of treee , with recursion. can be done also without recursion
	 */
	public int sizeOfTree(TreeNode node) {
		
		if(node == null) 
			return 0;
		size = size+1;
		 sizeOfTree(node.left) ;
		 sizeOfTree(node.right);
		
		 return size;
	}
	
	/*
	 * Size of treee , with recursion. can be done also without recursion
	 */
	public int heightOfTree(TreeNode node) {
		
		if(node == null) 
			return 0;
		
		int lHeight = heightOfTree(node.left) ;
		int rHeight = heightOfTree(node.right);
		
		if(lHeight > rHeight)
			return lHeight+1;
		else 
			return rHeight+1;
		
		 
	}
	
	
}
