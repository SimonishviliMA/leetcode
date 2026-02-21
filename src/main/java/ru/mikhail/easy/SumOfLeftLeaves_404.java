package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class SumOfLeftLeaves_404 {

    public static void main(String[] args) {
        System.out.println(sumOfLeftLeaves(new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        )));
    }

    private static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        AtomicInteger sum = new AtomicInteger();
        bfs(root, sum, false);
        return sum.get();
    }

    private static void bfs(TreeNode root, AtomicInteger sum, boolean l) {
        if (root.left == null && root.right == null) {
            sum.addAndGet(l ? root.val : 0);
            return;
        }
        if (root.left != null) bfs(root.left, sum, true);
        if (root.right != null) bfs(root.right, sum, false);
    }
}
