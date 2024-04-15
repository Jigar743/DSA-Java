package com.TreeBased;

import java.util.List;

public class InorderTraversal {
    public static void ThroughRecursion(TreeNode root, List<Integer> list){
        if(root == null) return;

        ThroughRecursion(root.left, list);
        list.add(root.val);
        ThroughRecursion(root.right, list);
    }
}
