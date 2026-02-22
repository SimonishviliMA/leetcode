package ru.mikhail.utils;


import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode arrayToTreeNode(Integer[] vals) {
        if (vals == null || vals.length == 0 || vals[0] == null) return null;

        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while(!q.isEmpty() && i < vals.length) {
            TreeNode curr = q.poll();

            Integer leftVal = vals[i++];
            if (leftVal != null) {
                curr.left = new TreeNode(leftVal);
                q.add(curr.left);
            }

            if (i < vals.length) {
                Integer rightVal = vals[i++];
                if (rightVal != null) {
                    curr.right = new TreeNode(rightVal);
                    q.add(curr.right);
                }
            }
        }
        return root;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
