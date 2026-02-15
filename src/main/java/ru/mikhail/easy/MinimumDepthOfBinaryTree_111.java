package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree_111 {

    public static void main(String[] args) {
        System.out.println(minDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    private static int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);
        int height = 1;
        while (!bfs.isEmpty()) {
            int size = bfs.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = bfs.poll();
                if (curr.left == null && curr.right == null) return height;
                if (curr.left != null) bfs.add(curr.left);
                if (curr.right != null) bfs.add(curr.right);
            }
            height++;
        }
        return height;
    }
}
