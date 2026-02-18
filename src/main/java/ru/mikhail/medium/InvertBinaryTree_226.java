package ru.mikhail.medium;

import ru.mikhail.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_226 {

    public static void main(String[] args) {
//        [4,2,7,1,3,6,9]
        System.out.println(invertTree(new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9))
        )));
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i = 0; i < qSize; i++) {
                TreeNode curr = q.poll();
                TreeNode tmp = curr.left;
                curr.left = curr.right;
                curr.right = tmp;
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return root;
    }
}
