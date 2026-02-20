package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {

    public static void main(String[] args) {
        System.out.println(binaryTreePaths(new TreeNode(1,
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

    private static List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return List.of();
        List<String> result = new ArrayList<>();
        deep(root, new StringBuilder(), result);
        return result;
    }

    private static void deep(TreeNode root, StringBuilder path, List<String> result) {
        if (!path.isEmpty()) {
            path.append("->");
        }
        path.append(root.val);
        if (root.left == null && root.right == null) {
            result.add(path.toString());
        } else {
            if (root.left != null) deep(root.left, new StringBuilder(path), result);
            if (root.right != null) deep(root.right, new StringBuilder(path), result);
        }
    }
}
