package com.Tree;

import java.util.*;

public class ZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (true){
            int size = q.size();
            if(size == 0) break;

            while (size > 0){
                TreeNode curr = q.remove();
                temp.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);

                if(curr.right != null)
                    q.add(curr.right);

                size--;
            }
            if(level % 2 == 1){
                Collections.reverse(temp);
            }
            level++;
            result.add(new ArrayList<>(temp));
            temp.clear();
        }
        return result;
    }
}
