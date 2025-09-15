package ru.mikhail.medium;

import ru.mikhail.utils.ListNode;

/**
 * We have opportunity to work with loops such as "for" and/or "while", but I wanted to use a recursive method instead.
 * I think that could be more interesting and easier to understand.
 */
public class RemoveNthNodeFromEndOfList_19 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(removeNthFromEnd(head,2));
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        return removeNthElem(new Pair<>(0, head), n).getVal2();
    }

    private static Pair<Integer, ListNode> removeNthElem(Pair<Integer, ListNode> headPair, int n) {
        ListNode head = headPair.getVal2();
        if (head == null) {
            return new Pair<>(headPair.getVal1() + 1, head);
        }
        Pair<Integer, ListNode> pair = removeNthElem(new Pair<>(headPair.getVal1(), head.next), n);
        if (pair.getVal1() != n) {
            head.next = pair.getVal2();
            return new Pair<>(pair.getVal1() > 0 ? pair.getVal1() + 1 : pair.getVal1(), head);
        } else {
            head = head.next;
            return new Pair<>(headPair.getVal1(), head);
        }
    }


    private static class Pair<T,K> {
        private final T val1;
        private final K val2;

        private Pair(T val1, K val2) {
            this.val1 = val1;
            this.val2 = val2;
        }

        public T getVal1() {
            return val1;
        }

        public K getVal2() {
            return val2;
        }
    }
}

