package com.LinkedListBased;

public class LinkedListCommon {
    public ListNode middleOfLL(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public void printLinkedList(ListNode root) {
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public ListNode insert(ListNode node, int val) {
        ListNode newNode = new ListNode(val);

        if (node == null) {
            node = newNode;
        } else {
            ListNode tmpNode = node;
            while (tmpNode.next != null) {
                tmpNode = tmpNode.next;
            }
            tmpNode.next = newNode;
        }
        return node;
    }

    public ListNode createLinkedList(int[] arr) {
        ListNode root = null;

        for (int val : arr) {
            root = insert(root, val);
        }

        return root;
    }

    public ListNode reverseLinkedList(ListNode root){
        ListNode curr = root;
        ListNode next = null;
        ListNode prev = null;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
