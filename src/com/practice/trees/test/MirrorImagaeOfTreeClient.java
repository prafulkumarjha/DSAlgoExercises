package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.MirrorImageOfTree;

/**
 * @author Praful Jha
 *
 */
public class MirrorImagaeOfTreeClient {

	public static void main(String[] args) {
	TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    
    MirrorImageOfTree mirror = new MirrorImageOfTree(root);
    mirror.inOrder(root);
    System.out.println();
    mirror.mirrorOfTree(root);
    mirror.inOrder(root);
    
    
	}
}
