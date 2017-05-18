package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.LevelOfANodeInBinaryTree;;

public class LevelOfANodeInBinaryTreeClient {

	
public static void main(String args[]) {
		
		TreeNode root = new TreeNode(3); 
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
	//	root.left.right.left = new TreeNode(7);
		//root.left.right.right = new TreeNode(4);
		//root.right.left = new TreeNode(4);
		//root.right.right = new TreeNode(4);
		
		LevelOfANodeInBinaryTree levelOfBinaryTree = new LevelOfANodeInBinaryTree(root);
		
		for (int x = 1; x <= 5; x++) 
        {
            int level = levelOfBinaryTree.getLevelOfNode(x);
            if (level != -1)
                System.out.println("Level of " + x + " is "
                        + levelOfBinaryTree.getLevelOfNode(x));
            else
                System.out.println(x + " is not present in tree");
        }
		//System.out.println("Level of node is  : "+level.getLevelOfNode(3));
		
	}

}
