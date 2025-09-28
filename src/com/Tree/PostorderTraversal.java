package com.Tree;

import java.util.List;

public class PostorderTraversal {
    public void postorderRecursive(TreeNode root, List<Integer> list){
        if(root == null) return;

        postorderRecursive(root.left, list);
        postorderRecursive(root.right, list);
        list.add(root.val);
    }
}
