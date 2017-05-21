package com.practice.trees.services;

import java.util.ArrayList;
import java.util.List;
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
	
		//int a =0;
		TreeNode node = root ;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		//stack.push(root);
		while(true) {
			while(node != null) {
				//a++;
				stack.push(node);
				node = node.left;
			}
			if(stack.isEmpty()) {
				System.out.println();
				//System.out.println(a);
				return;
			}
			 node = stack.pop();
			System.out.print(node.data+" ");
			
			//	stack.push(node);
				node = node.right;
			//a++;
				
		}
		
		

	}
	
	/*public void postOrder() {
		
		TreeNode node = root;
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(true) {
			
			if(node != null) {
				stack.push(node);
				node = node.left;
			} else {
				
				if(stack.isEmpty()) {
					System.out.println("Stack is Empty");
					return ;
				}
				else if(stack.peek().right == null) {
					node = stack.pop();
					System.out.print(node.data+" ");
					if(node == stack.peek().right) {
						System.out.print(stack.peek().data+" ");
						node = stack.pop();
					}
				}
				if(!stack.isEmpty()) {
					node = stack.peek().right;
				}
				else 
					node = null;
			}
			
		}
		
	}*/
	
	/*public void postOrder() {
		//List<Integer> res = new ArrayList<Integer>();
		 
	    if(root==null) {
	        return ;
	    }
	 
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    stack.push(root);
	 
	    while(!stack.isEmpty()) {
	        TreeNode temp = stack.peek();
	        if(temp.left==null && temp.right==null) {
	            TreeNode pop = stack.pop();
	           // res.add(pop.data);
	            System.out.print(pop.data+" ");
	        }
	        else {
	            if(temp.right!=null) {
	                stack.push(temp.right);
	                temp.right = null;
	            }
	 
	            if(temp.left!=null) {
	                stack.push(temp.left);
	                temp.left = null;
	            }
	        }
	    }
	 
	    return ;
		
	}*/
	
	// An iterative function to do postorder traversal 
    // of a given binary tree
   public  ArrayList<Integer> postOrder() 
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	TreeNode node = root;
        Stack<TreeNode> S = new Stack<TreeNode>();
          
        // Check for empty tree
        if (node == null)
            return list;
        S.push(node);
        TreeNode prev = null;
        while (!S.isEmpty()) 
        {
            TreeNode current = S.peek();
  
            /* go down the tree in search of a leaf an if so process it 
            and pop stack otherwise move down */
            if (prev == null || prev.left == current || 
                                        prev.right == current) 
            {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.data);
                }
  
                /* go up the tree from left node, if the child is right 
                   push it onto stack otherwise process parent and pop 
                   stack */
            } 
            else if (current.left == prev) 
            {
                if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.data);
                }
                  
                /* go up the tree from right node and after coming back
                 from right node process parent and pop stack */
            } 
            else if (current.right == prev) 
            {
                S.pop();
                list.add(current.data);
            }
  
            prev = current;
        }
  
        return list;
    }
		
}
