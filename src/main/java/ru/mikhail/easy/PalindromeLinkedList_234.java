package ru.mikhail.easy;

import ru.mikhail.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList_234 {

    public static void main(String[] args) {
        System.out.println(isPalindromeSlowFast(ListNode.arrayToListNode(new int[] {1,1,0,1,1})));
        System.out.println(isPalindrome(ListNode.arrayToListNode(new int[] {1,1,0,1,1})));
    }

    private static boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        List<Integer> dll = new ArrayList<>();
        while (head != null) {
            dll.add(head.val);
            head = head.next;
        }
        int i = 0;
        int j = dll.size() - 1;
        while (i < j) {
            if (!dll.get(i++).equals(dll.get(j--))) return false;
        }
        return true;
    }

    private static boolean isPalindromeSlowFast(ListNode head) {
        ListNode slow = head, fast = head;
        List<Integer> rev = new ArrayList<>();
        while (fast != null && fast.next != null) {
            rev.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) rev.add(slow.val);
        for (int i = rev.size() - 1; i >= 0; i--) {
            if (slow == null || !rev.get(i).equals(slow.val)) return false;
            slow = slow.next;
        }
        return rev.isEmpty() && slow == null;
    }


}
