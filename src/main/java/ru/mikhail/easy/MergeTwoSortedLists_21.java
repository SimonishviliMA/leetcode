package ru.mikhail.easy;

import ru.mikhail.utils.ListNode;

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(l1, l2));
    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode result = new ListNode();
        ListNode next = result;

        do {
            int l1Val = list1.val;
            int l2Val = list2.val;
            if (l1Val < l2Val) {
                next.val = l1Val;
                list1 = list1.next;
            } else {
                next.val = l2Val;
                list2 = list2.next;
            }
            if (list1 != null && list2 != null) {
                next.next = new ListNode();
                next = next.next;
            }
        } while(list1 != null && list2 != null);

        next.next = list1 != null ? list1 : list2;

        return result;
    }

}
