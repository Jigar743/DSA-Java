package com.LinkedListBased;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        LinkedListCommon linkedListCommon = new LinkedListCommon();
        int[] arr = {7, 7, 7, 7};
        ListNode head = linkedListCommon.createLinkedList(arr);

        linkedListCommon.printLinkedList(head);

        linkedListCommon.printLinkedList(solve(head, 7));
    }

    public static ListNode solve(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;

        while(current != null && current.next != null) {
            if(current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
