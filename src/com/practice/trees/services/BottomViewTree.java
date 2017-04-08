package com.practice.trees.services;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

import com.practice.node.QItem;
import com.practice.node.TreeNode;

/**
 * @author Praful Jha
 *
 */
public class BottomViewTree {

	TreeNode root = null;

	//Get the reference of root node...
	public BottomViewTree(TreeNode root) {
		super();
		this.root = root;
	}
	
	
	//Print what node of the tree will be seen if viewed from top...
	public void bottomViewOfTree() {
	
		Queue<QItem> Q = new LinkedList<QItem>(); 
		
		Q.add(new QItem(root,0));
		
		TreeMap<Integer, TreeNode> map = new TreeMap<Integer,TreeNode>();
		
		while(!Q.isEmpty()) {
			QItem temp = Q.remove();
			TreeNode node = temp.node;
			int hd = temp.hd;
			map.put(hd, node);
			
			if(node !=null && node.left != null) {
				Q.add(new QItem(node.left,hd-1));
			}
			
			if(node !=null && node.right !=null) {
				Q.add(new QItem(node.right,hd+1));
			}
			
		}
		
		map.forEach((hd,node) -> {
			
			System.out.print(node.data+" ");
			
		});
		
		
	}
	
	
	
	
	
}
