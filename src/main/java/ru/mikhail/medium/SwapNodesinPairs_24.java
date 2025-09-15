package ru.mikhail.medium;

import ru.mikhail.utils.ListNode;

public class SwapNodesinPairs_24 {

    public static void main(String[] args) {
        System.out.println(swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))))));
    }

    private static ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode();
        result.next = head;

        ListNode prev = result;
        while(head != null && head.next != null){

            ListNode first = head;
            ListNode second = head.next;

            prev.next = second;

            first.next = second.next;
            second.next = first;

            prev = first;
            head = head.next;
        }

        return result.next;
    }

//    private static ListNode swapPairs(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode result = new ListNode();
//        ListNode current = result;
//        int i = 0;
//        while (head != null) {
//            if (i % 2 == 0) {
//                ListNode first = head;
//                ListNode second = head.next;
//                second.next = new ListNode();
//                first.next = second;
//                current = first;
//                current = current.next.next;
//            } else if (head.next == null) {
//                current = head;
//                break;
//            }
//            i++;
//            head = head.next;
//        }
//        return result;
//    }
}
