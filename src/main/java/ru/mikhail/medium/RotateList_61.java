package ru.mikhail.medium;

import ru.mikhail.utils.ListNode;

public class RotateList_61 {
    public static void main(String[] args) {
        ListNode head = ListNode.arrayToListNode(new int[]{1,2,3,4,5});
        System.out.println(rotateRight(head, 2));
    }


    private static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode[] nodes = new ListNode[3];
        nodes[0] = head;
        depth(nodes, new int[]{k, 1});

        if (nodes[1] != null) {
            nodes[2].next = head;
            return nodes[1];
        }
        return head;
    }

    private static void depth(ListNode[] nodes, int[] len) {
        ListNode curr = nodes[0];

        if (curr.next != null) {
            len[1]++;
            nodes[0] = curr.next;
            depth(nodes, len);
        } else {
            nodes[2] = curr;
            if (len[0] >= len[1]) {
                len[0] %= len[1];
            }
        }
        if (len[0] == 0) {
            nodes[1] = curr.next;
            curr.next = null;
        }
        len[0]--;
    }

}
