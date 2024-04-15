package com.TreeBased;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (true){
            int size = q.size();
            if(size == 0) break;
            List<Integer> temp = new ArrayList<>();

            while(size > 0){
                TreeNode curr = q.remove();
                temp.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
                size--;
            }
            result.add(temp);
        }
        return result;
    }
}
