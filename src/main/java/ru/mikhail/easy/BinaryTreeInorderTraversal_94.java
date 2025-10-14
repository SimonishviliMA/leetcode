package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {

    public static void main(String[] args) {
        System.out.println(
                inorderTraversal(new TreeNode(1, null, new TreeNode(2,new TreeNode(3, null, null), null)))
        );
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        deep(root, result);
        return result;
    }

    private static void deep(TreeNode cur, List<Integer> result) {
        if (cur == null) return;
        deep(cur.left, result);
        result.add(cur.val);
        deep(cur.right, result);
    }
}
