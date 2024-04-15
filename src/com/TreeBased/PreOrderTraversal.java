package com.TreeBased;

import java.util.List;

public class PreOrderTraversal {
    public void preorderRecursive(TreeNode root, List<Integer> list){
        if(root == null) return;

        list.add(root.val);
        preorderRecursive(root.left, list);
        preorderRecursive(root.right, list);
    }
}
