package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

public class SymmetricTree_101 {

    public static void main(String[] args) {
        System.out.println(isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)))));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return deep(root.left, root.right);
    }

    private static boolean deep(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;
        if (!deep(left.left, right.right)) return false;
        return deep(left.right, right.left);
    }
}
