package com.practice.trees.services;

import java.util.LinkedList;
import java.util.Queue;

import com.practice.node.TreeNode;

public class MaxElementLevelOfTree {

	TreeNode root = null;

	public MaxElementLevelOfTree(TreeNode root) {
		super();
		this.root = root;
	}
	public int getMaxElementLevel2() {
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		
		if(root == null)
			return 0;
		Q.add(root);
		Q.add(null);//Null as a marker for identifying level end
		int level = 0;
		int elements_on_this_level = 0;
		int max_element_on_any_level = 0;
		int max_element_level = 0;
		
		while(!Q.isEmpty()) {
			TreeNode temp_node = Q.remove(); 
			elements_on_this_level++;
			if(temp_node == null) // it's end of a level 
			{
				if(max_element_on_any_level < elements_on_this_level) {
					max_element_on_any_level = elements_on_this_level;
					max_element_level = level;
				}
				elements_on_this_level = 0;
				
				if(!Q.isEmpty())
				Q.add(null);
				level++;
			} 
			else {
			if(temp_node.left != null){
				Q.add(temp_node.left);
			}
			if(temp_node.right != null) {
				Q.add(temp_node.right);
			}
			}
		}
		System.out.println("Level of tree "+level);
		
		return max_element_level;
	}
	
	public int getMaxElementLevel() {
		
		Queue<TreeNode> Q = new LinkedList<TreeNode>();
		
		Q.add(root);
		
		int curr_max_element_size = 0; 
		int level_with_max_element = 0;
		
		
			
			int k = -1;
			while(true) {
				int current_level_size = Q.size();
				int i = 0;
			while(i++<current_level_size)  {
				TreeNode temp_node = Q.remove();
				if(temp_node.left != null)
					Q.add(temp_node.left);
				if(temp_node.right != null)
					Q.add(temp_node.right);
			}
			
			k++;
			if(current_level_size > curr_max_element_size )
			{
				curr_max_element_size = current_level_size;
				level_with_max_element = k;
			}
			
			if(Q.isEmpty()) {
				return level_with_max_element;
			}
		
	}
		
		
			
		
	}
	
	
}
