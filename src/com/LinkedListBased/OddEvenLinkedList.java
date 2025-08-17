package com.LinkedListBased;

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        ListNode oddList = odd;
        ListNode evenList = even;

        int idx = 1;
        while (head != null) {
            if(idx %2 == 0) {
                evenList.next = head;
                evenList = evenList.next;
            } else {
                oddList.next = head;
                oddList = oddList.next;
            }
            head = head.next;
            idx++;
        }
        evenList.next = null;
        oddList.next = even.next;

        return odd.next;
    }
    public static void main(String[] args) {
        LinkedListCommon llc = new LinkedListCommon();
        int[] arr = {1, 2, 3, 4, 5};
        ListNode root = llc.createLinkedList(arr);

        llc.printLinkedList(root);

        ListNode resultNode = oddEvenList(root);
        llc.printLinkedList(resultNode);
    }
}
