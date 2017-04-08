package com.practice.trees.services;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import com.practice.node.QItem;
import com.practice.node.TreeNode;

/**
 * @author Praful Jha
 *
 */
public class TopViewTree {

	TreeNode root = null;
	
	public TopViewTree(TreeNode root) {
		this.root = root;
	}
	
	public void topViewOfTree() {
		Queue<QItem> Q = new LinkedList<QItem>();
		Q.add(new QItem(root,0));
		Set<Integer> set = new HashSet<Integer>();
		
		while(!Q.isEmpty()) {
			QItem temp = Q.remove();
			TreeNode node = temp.node;
			int hd = temp.hd;
			
			if(!set.contains(hd))  {
				System.out.print(node.data+" ");
				set.add(hd);
			}
			
			if(node != null && node.left != null) {
				Q.add(new QItem(node.left,hd-1));
			}
			if(node != null && node.right != null) {
				Q.add(new QItem(node.right,hd+1));
			}
				
			
		}
	}
}
