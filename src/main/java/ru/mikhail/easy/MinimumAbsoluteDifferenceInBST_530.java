package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

public class MinimumAbsoluteDifferenceInBST_530 {

    public static void main(String[] args) {
        System.out.println(getMinimumDifference(new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(6),
                                new TreeNode(7)
                        )
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(8,
                                new TreeNode(9),
                                null
                        )
                )
        )));
    }

    private static int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        int[] minDiff = new int[]{Integer.MAX_VALUE};
        dfs(root, minDiff, new int[]{Integer.MAX_VALUE});
        return minDiff[0];
    }

    private static void dfs(TreeNode root, int[] minDiff, int[] prev) {
        if (root == null) return;
        dfs(root.left, minDiff, prev);
        minDiff[0] = Math.min(Math.abs(root.val - prev[0]), minDiff[0]);
        prev[0] = root.val;
        dfs(root.right, minDiff, prev);
    }
}
