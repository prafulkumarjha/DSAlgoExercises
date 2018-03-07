package com.practice.trees.services;

import com.practice.node.TreeNode;

/**
 * created by Praful Jha on 23/02/2018
 */
public class IsBinarySearchTree {

    public boolean isBinarySearchTreeUtil(TreeNode node, int min, int max) {

        if(node == null)
            return true;
        if(node.data < min || node.data >max) {
            return false;
        }
       return isBinarySearchTreeUtil(node.left,min, node.data-1) && isBinarySearchTreeUtil(node.right, node.data+1, max);
    }




}
