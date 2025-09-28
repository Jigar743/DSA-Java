package com.LinkedListBased;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        k = k % length;
        int rotateAfterIndex = length - k;
        if(rotateAfterIndex == 0 || k == 0) return head;

        current = head;
        for(int i = 0; i< rotateAfterIndex - 1; i++) {
            current = current.next;
        }
        ListNode temp = current.next;
        current.next = null;

        ListNode tempCurr = temp;
        while (tempCurr.next != null) {
            tempCurr = tempCurr.next;
        }

        tempCurr.next = head;

        return temp;
    }
    public static void main(String[] args) {
        LinkedListCommon linkedListCommon = new LinkedListCommon();
        int[] arr = {1, 2, 3, 4, 5};
        int k= 2;

        ListNode root = linkedListCommon.createLinkedList(arr);
        linkedListCommon.printLinkedList(root);
        linkedListCommon.printLinkedList(rotateRight(root, k));
    }
}
