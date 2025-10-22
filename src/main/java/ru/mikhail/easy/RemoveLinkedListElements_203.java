package ru.mikhail.easy;

import ru.mikhail.utils.ListNode;

public class RemoveLinkedListElements_203 {

    public static void main(String[] args) {
        System.out.println(removeElements(
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))),
                6
        ));
    }

    private static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
