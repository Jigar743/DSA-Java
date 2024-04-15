package com.LinkedListBased;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        LinkedListCommon linkedListCommon = new LinkedListCommon();
        int[] arr = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = linkedListCommon.createLinkedList(arr);

        linkedListCommon.printLinkedList(head);

        linkedListCommon.printLinkedList(solve(head, 6));
    }

    public static ListNode solve(ListNode head, int val) {
        ListNode root = head;

        return root;
    }
}
