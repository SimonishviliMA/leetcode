package ru.mikhail.easy;

import ru.mikhail.utils.ListNode;

public class LinkedListCycle_141 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2, new ListNode(0, new ListNode(-4, head)));
        System.out.println(hasCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            if (fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
