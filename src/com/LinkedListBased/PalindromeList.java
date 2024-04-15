package com.LinkedListBased;

public class PalindromeList {
    public static boolean isPalindrome(ListNode A){
        ListNode head1 = A;

        if (A.next == null) return true;

        LinkedListCommon linkedListCommon = new LinkedListCommon();

        ListNode mid = linkedListCommon.middleOfLL(A);
        ListNode head2 = linkedListCommon.reverseLinkedList(mid.next);

        mid.next = null;

        while (head1 != null && head2 != null){
            if(head1.val != head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedListCommon linkedListCommon = new LinkedListCommon();
        int [] arr = {1, 2};

        ListNode head = linkedListCommon.createLinkedList(arr);

        linkedListCommon.printLinkedList(head);

        System.out.println(isPalindrome(head));
    }
}
