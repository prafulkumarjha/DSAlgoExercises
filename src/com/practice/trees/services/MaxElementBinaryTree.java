package com.practice.trees.services;

import java.util.Stack;

import com.practice.node.TreeNode;

/**
 * @author Praful Jha
 *
 */
public class MaxElementBinaryTree {
	
	TreeNode root = null;
	static int max_elem = 0;
	

	public MaxElementBinaryTree(TreeNode root) {
		super();
		this.root = root;
	}

	/*
	 * Finding max elemement in binary tree, without using recursion
	 */
	public int findMaxElement() {
		int max_element = Integer.MIN_VALUE;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			if(node.data> max_element)
				max_element = node.data;
			if(node.right !=null) {
				stack.push(node.right);
			}
			if(node.left != null) {
				stack.push(node.left);
			}
		}	
		return max_element;
	}
	
	/*
	 * Finding max elemement in binary tree, using recursion
	 */
	public int findMaxElementRecursion(TreeNode node) {
		if(node == null) 
			return 0;
		max_elem = Integer.max(max_elem, node.data);
		findMaxElementRecursion(node.left);
		findMaxElementRecursion(node.right);
		return max_elem;
	}
	
	/*
	 * Finding max element in binary tree using recursion
	 */
	public int findMaxElementRecursion2(TreeNode node) {
		int root_val, left,right, max = Integer.MIN_VALUE;
		if(node != null) {
			root_val = node.data;
			System.out.println("root data  : "+root_val);
			left = findMaxElementRecursion2(node.left);
			System.out.println("left: "+left);
			right = findMaxElementRecursion2(node.right);
			System.out.println("right: "+right);
			if(left > right)
				max = left;
			else max = right;
			if(root_val > max)
				max = root_val;
			System.out.println("max : "+max);		
		}
		return max;
	}
	
}
