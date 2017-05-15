package com.practice.trees.services;

import java.util.Stack;

import com.practice.node.TreeNode;

/**
 * @author Praful Jha
 *
 */
public class TreeTraversalService {

	TreeNode root = null;

	public TreeTraversalService(TreeNode root) {
		super();
		this.root = root;
	}
	
	public void preOrder() {
		if(root == null) {
			System.out.println("Tree is Empty");
			return ;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.isEmpty()) {
			TreeNode temp = stack.pop(); 
			System.out.print(temp.data+" ");
			if(temp.right != null) {
				stack.push(temp.right);
			}
			if(temp.left != null) {
				stack.push(temp.left);
			}
		/*	if(temp.left != null && temp.right !=null) {
				stack.push(temp.right);
				stack.push(temp.left);
			}*/
			
		}
		System.out.println();
	}
	
	
	public void inOrder()  {
	
		TreeNode node = root ;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(true) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			if(stack.isEmpty()) {
				System.out.println();
				return;
			}
			 node = stack.pop();
			System.out.print(node.data+" ");
			
			//	stack.push(node);
				node = node.right;
			
				
		}
		

	}
	
	public void postOrder() {
		
		TreeNode node = root;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(true) {
			
			while(node !=null) {
				stack.push(node);
				node = node.left;
			}
			
			if(stack.isEmpty()) {
				System.out.println();
				return;
			}
			//node = stack.pop();
			
			if(stack.peek().right == null) {
				node = stack.pop();
				System.out.print(node.data+" ");
				node = null;
			}
			else {
				stack.push(node);
				node = node.right;
			}
			
		}
		
	}
		
}
