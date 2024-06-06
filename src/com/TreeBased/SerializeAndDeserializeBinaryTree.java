package com.TreeBased;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    public String serialize(TreeNode root) {
        if(root == null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder res = new StringBuilder();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node == null){
                res.append("n ");
                continue;
            }
            res.append(node.val + " ");
            q.add(node.left);
            q.add(node.right);
        }

        return res.toString();
    }

    public TreeNode deSerialize(String data) {
        if(data.isEmpty()) return null;

        Queue<TreeNode> q = new LinkedList<>();
        String[] values = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);

        for(int i = 1; i < values.length; i += 2){
            TreeNode parent = q.poll();
            if(!values[i].equals("n")){
                TreeNode left = new TreeNode(Integer.parseInt(values[i]));
                parent.left = left;
                q.add(left);
            }
            if(!values[i+1].equals("n")){
                TreeNode right = new TreeNode(Integer.parseInt((values[i+1])));
                parent.right = right;
                q.add(right);
            }
        }

        return root;
    }
}
