package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

public class BalancedBinaryTree_110 {

    public static void main(String[] args) {
        //1,2,3,4,5,6,null,8
        System.out.println(isBalanced(
                new TreeNode(1,
                        new TreeNode(2, new TreeNode(3,
                                new TreeNode(4),
                                null
                        ), null
                        ),
                        new TreeNode(2,
                                null,
                                new TreeNode(3,
                                        null,
                                        new TreeNode(4)
                                )
                        )
                )
        ));
    }

    private static boolean isBalanced(TreeNode root) {
        return dfs(root, 1) != -1;
    }

    private static int dfs(TreeNode root, int height) {
        if (root == null) return height;
        int leftHeight, rightHeight;
        leftHeight = dfs(root.left, height + 1);
        rightHeight = dfs(root.right, height + 1);
        if (leftHeight == -1 || rightHeight == -1) return -1;
        int diff = leftHeight - rightHeight;
        return Math.abs(diff) <= 1 ? Math.max(leftHeight, rightHeight) : -1;
    }
}
