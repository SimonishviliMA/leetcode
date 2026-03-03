package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

public class CountCompleteTreeNodes_222 {

    public static void main(String[] args) {
        System.out.println(countNodes(TreeNode.arrayToTreeNode(new Integer[]{1,2,3,4,5,6})));
    }

    private static int countNodes(TreeNode root) {
        if (root == null) return 0;
        int[] result = new int[]{0};
        dfs(root, result);
        return result[0];
    }

    private static void dfs(TreeNode node, int[] result) {
        if (node == null) return;
        result[0]++;
        dfs(node.left, result);
        dfs(node.right, result);
    }
}
