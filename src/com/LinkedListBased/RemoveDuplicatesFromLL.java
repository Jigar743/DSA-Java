package com.LinkedListBased;

import java.util.HashSet;

public class RemoveDuplicatesFromLL {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;

        HashSet<Integer> set = new HashSet<>();
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            if (!set.contains(temp.val)) {
                set.add(temp.val);
                prev = temp;
                temp = temp.next;
            } else {
                prev.next = temp.next;
                temp = temp.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        LinkedListCommon linkedListCommon = new LinkedListCommon();

        int[] arr = {1, 2, 2, 3};

        ListNode root = linkedListCommon.createLinkedList(arr);

        ListNode ans = deleteDuplicates(root);
        linkedListCommon.printLinkedList(ans);
    }
}
