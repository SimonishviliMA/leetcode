package ru.mikhail.easy;

import ru.mikhail.utils.ListNode;

public class ReverseLinkedList_206 {

    public static void main(String[] args) {
        System.out.println(reverseList(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))
        ));
    }


    private static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode reverse = new ListNode();
        deeper(head, reverse);
        return reverse;
    }

    private static ListNode deeper(ListNode head, ListNode reverse) {
        if (head.next != null) {
            reverse = deeper(head.next, reverse);
            reverse.next = new ListNode(head.val);
            return reverse.next;
        }
        reverse.val = head.val;
        return reverse;
    }
}
