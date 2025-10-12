package ru.mikhail.easy;

import ru.mikhail.utils.ListNode;

public class IntersectionOfTwoLinkedLists_160 {

    public static void main(String[] args) {
        System.out.println(
                getIntersectionNode(
                        new ListNode(4, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))),
                        new ListNode(5, new ListNode(6, new ListNode(1, new ListNode(8, new ListNode(4, new ListNode(5))))))
                )
        );
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
