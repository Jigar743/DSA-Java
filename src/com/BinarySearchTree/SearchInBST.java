package com.BinarySearchTree;

public class SearchInBST {

    public static void main(String[] args) {
        CommonUsesForBST commonUsesForBST = new CommonUsesForBST();

        int[] arr = {4, 5, 8, 2, 7, 10, 1, 6, 15, 3};
        commonUsesForBST.createBStFromArray(arr);

        commonUsesForBST.inorder();
    }
}
