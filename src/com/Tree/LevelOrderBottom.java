package com.Tree;

import java.util.*;

public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();

            int size = queue.size();
            while (size > 0) {
                TreeNode curr = queue.remove();
                temp.add(curr.val);
                if(curr.left != null){
                    queue.add(curr.left);
                }

                if(curr.right != null){
                    queue.add(curr.right);
                }
                size--;
            }

            result.add(temp);
        }

        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {

    }
}
