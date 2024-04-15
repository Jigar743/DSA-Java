package com.TreeBased;

import java.util.LinkedList;
import java.util.Queue;

public class TreeCommon {
    public static TreeNode ArrayToTree(int[] arr) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        q.add(root);
        TreeNode curr;

        for (int i = 1; i < arr.length; i += 2) {
            curr = q.remove();

            if (arr[i] != -1) {
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }

            if (arr[i + 1] != -1) {
                curr.right = new TreeNode(arr[i + 1]);
                q.add(curr.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1};

        TreeNode root = ArrayToTree(arr);

    }
}
