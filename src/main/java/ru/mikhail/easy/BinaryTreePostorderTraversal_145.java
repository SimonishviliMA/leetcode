package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal_145 {

    public static void main(String[] args) {
        System.out.println(postorderTraversal(new TreeNode(1,
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

    private static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return List.of();
        List<Integer> result = new ArrayList<>();
        deep(root, result);
        return result;
    }

    private static void deep(TreeNode root, List<Integer> result) {
        if (root == null) return;
        deep(root.left, result);
        deep(root.right, result);
        result.add(root.val);
    }
}
