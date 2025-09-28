package com.LinkedListBased;

public class RemoveNthNodeFromList {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;

        int length = 0;
        ListNode current = head;
        while(current != null) {
            length++;
            current = current.next;
        }

        int indexToRemove = length - n;
        if(indexToRemove == 0) return head.next;

        current = head;
        for(int i = 0; i < indexToRemove - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LinkedListCommon linkedListCommon = new LinkedListCommon();

        ListNode root = linkedListCommon.createLinkedList(arr);
        linkedListCommon.printLinkedList(root);

        int n = 2;
        linkedListCommon.printLinkedList(removeNthFromEnd(root, n));
    }
}
