package ru.mikhail.medium;

import ru.mikhail.utils.TreeNode;

public class RecoverBinarySearchTree_99 {

    private static TreeNode first = null, last = null, prev = null;

    public static void main(String[] args) {
        TreeNode tree = TreeNode.arrayToTreeNode(new Integer[]{3,1,4,null,null,2});
        recoverTree(tree);
        System.out.println(tree);
    }

    private static void recoverTree(TreeNode root) {
        if (root == null) return;
        dfs(root);
        int tmp = first.val;
        first.val = last.val;
        last.val = tmp;
    }

    private static void dfs(TreeNode curr) {
        if (curr == null) return;
        dfs(curr.left);
        if (prev != null && prev.val > curr.val) {
            if (first == null) {
                first = prev;
            }
            last = curr;
        }
        prev = curr;
        dfs(curr.right);
    }
}
