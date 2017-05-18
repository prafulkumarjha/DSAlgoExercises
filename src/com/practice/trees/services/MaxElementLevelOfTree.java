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
