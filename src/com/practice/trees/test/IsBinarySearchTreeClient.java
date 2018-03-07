package com.practice.trees.test;

import com.practice.node.TreeNode;
import com.practice.trees.services.IsBinarySearchTree;

/**
 * created by Praful Jha on 23/02/2018
 */
public class IsBinarySearchTreeClient {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        IsBinarySearchTree isBinarySearchTree = new IsBinarySearchTree();
        System.out.println(isBinarySearchTree.isBinarySearchTreeUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

}
