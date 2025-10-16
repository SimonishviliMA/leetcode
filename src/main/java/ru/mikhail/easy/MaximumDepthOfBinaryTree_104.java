package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

public class MaximumDepthOfBinaryTree_104 {

    public static void main(String[] args) {
        System.out.println(maxDepth(new TreeNode(1, null, new TreeNode(2))));
    }

    private static int maxDepth(TreeNode root) {
        return deep(root, 0);
    }

    private static int deep(TreeNode leaf, int max) {
        if (leaf == null) return max;
        max++;
        return Math.max(deep(leaf.left, max), deep(leaf.right, max));
    }
}
