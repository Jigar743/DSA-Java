package com.LinkedListBased;

public class DeleteMiddleNodeFromLL {
    public static ListNode deleteMiddleNode(ListNode head) {
        ListNode root = head;
        int size = 0;

        while(root != null) {
            size++;
            root= root.next;
        }

        if(size == 1) return head;

        root = head;
        for(int i = 0; i< (size / 2) - 1; i++) {
            root = root.next;
        }

        root.next = root.next.next;

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 1, 2, 6};
        LinkedListCommon llc = new LinkedListCommon();
        ListNode root = llc.createLinkedList(arr);

        ListNode resultNode = deleteMiddleNode(root);
        llc.printLinkedList(resultNode);

    }
}
