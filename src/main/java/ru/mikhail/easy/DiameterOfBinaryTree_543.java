package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

public class DiameterOfBinaryTree_543 {

    public static void main(String[] args) {
        System.out.println(diameterOfBinaryTree(
                TreeNode.arrayToTreeNode(new Integer[]{4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2})
        ));
    }

    private static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int[] maxD = new int[]{0};
        dfs(root, maxD);
        return maxD[0];
    }

    private static int dfs(TreeNode root, int[] maxD) {
        if (root == null) return 0;
        int leftHeight = dfs(root.left, maxD);
        int rightHeight = dfs(root.right, maxD);
        maxD[0] = Math.max(maxD[0], leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
