package com.LinkedListBased;

public class Main {
    public static void main(String[] args) {
        System.out.println("from linked list package");
        int[] arr = {5, 8, 10, 20, 6, 45};

        printLinkedList(createLinkedList(arr));
    }

    public static void printLinkedList(ListNode root){
        while(root != null){
            System.out.print(root.val + " -> ");
            root = root.next;
        }
        System.out.print("null");
    }

    public static ListNode insert(ListNode node, int val){
        ListNode newNode = new ListNode(val);

        if(node == null){
            node = newNode;
        }else{
            ListNode tmpNode = node;
            while(tmpNode.next != null){
                tmpNode = tmpNode.next;
            }
            tmpNode.next = newNode;
        }
        return node;
    }

    public static ListNode createLinkedList(int[] arr){
        ListNode root = null;

        for (int val: arr){
            root = insert(root, val);
        }

        return root;
    }
}
