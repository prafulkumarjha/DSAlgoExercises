package com.practice.trees.services;

import com.practice.node.TreeNode;

/**
 * created by Praful Jha on 23/02/2018
 */
public class LCABinarySearchTree {

    public TreeNode lca(TreeNode node,int n1, int n2) {

        if(node == null)
            return null;

        if( node.data >n1 && node.data > n2 )
            return lca(node.left, n1, n2);

        if(node.data < n1 &&  node.data <n2)
            return   lca(node.right, n1, n2);

        return node;

    }
}
