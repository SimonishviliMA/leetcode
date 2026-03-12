package ru.mikhail.utils;



public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return val + "" + next;
    }

    public static ListNode arrayToListNode(int[] vals) {
        return new ListNode(vals[0], vals.length > 1 ? recursiveListNode(vals, 1) : null);
    }

    private static ListNode recursiveListNode(int[] vals, int i) {
        return new ListNode(vals[i], i < vals.length - 1 ? recursiveListNode(vals, ++i) : null);
    }
}
