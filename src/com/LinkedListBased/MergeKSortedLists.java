package com.LinkedListBased;

public class MergeKSortedLists {
    public static ListNode mergeTwoList(ListNode list1, ListNode list2) {
        ListNode ansNode = new ListNode(-1);
        ListNode temp = ansNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        }

        if (list2 != null) {
            temp.next = list2;
        }

        return ansNode.next;
    }

    public static ListNode solve(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;

        ListNode resultNode = new ListNode(-1);
        ListNode temp = resultNode;
        temp.next = lists[0];

        for (int i = 0; i < lists.length - 1; i++) {
            temp.next = mergeTwoList(temp.next, lists[i + 1]);
        }

        return resultNode.next;
    }

    public static void main(String[] args) {
        int[][] listOfNodes = {
                {1, 4, 5},
                {1, 3, 4},
                {2, 6}
        };

        int n = listOfNodes.length;
        ListNode[] nodes = new ListNode[n];

        LinkedListCommon linkedListCommon = new LinkedListCommon();
        for (int i = 0; i < n; i++) {
            nodes[i] = linkedListCommon.createLinkedList(listOfNodes[i]);
        }

        for (ListNode node : nodes) {
            linkedListCommon.printLinkedList(node);
        }

        ListNode result = solve(nodes);

        linkedListCommon.printLinkedList(result);
    }
}
