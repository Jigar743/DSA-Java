package com.LinkedListBased;

public class MergeTwoSortedLists {
    public static ListNode solve(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(-1);
        ListNode tmp = result;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tmp.next = list1;
                list1 = list1.next;
            } else {
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }

        while (list1 != null) {
            tmp.next = list1;
            list1 = list1.next;
            tmp = tmp.next;
        }

        while (list2 != null) {
            tmp.next = list2;
            list2 = list2.next;
            tmp = tmp.next;
        }

        return result.next;
    }

    public static void main(String[] args) {
        LinkedListCommon l1 = new LinkedListCommon();

        int[] arr1 = {5, 8, 20};
        int[] arr2 = {4, 11, 15};

        ListNode list1 = l1.createLinkedList(arr1);
        ListNode list2 = l1.createLinkedList(arr2);

        l1.printLinkedList(list1);
        l1.printLinkedList(list2);

        ListNode result = solve(list1, list2);
        l1.printLinkedList(result);
    }
}
