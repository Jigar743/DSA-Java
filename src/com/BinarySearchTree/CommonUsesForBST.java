package com.BinarySearchTree;

public class CommonUsesForBST {
    Node root;

    CommonUsesForBST() {
        root = null;
    }

    private void insert(int val) {
        root = insertIntoTree(root, val);
    }

    private Node insertIntoTree(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.val) {
            root.left = insertIntoTree(root.left, val);
        } else if (val > root.val) {
            root.right = insertIntoTree(root.right, val);
        }

        return root;
    }

    public void createBStFromArray(int[] arr) {
        for (int val: arr) {
            insert(val);
        }
    }

    public void inorder() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node root) {
        if(root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}
