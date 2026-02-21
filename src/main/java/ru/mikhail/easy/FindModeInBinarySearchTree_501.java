package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

import java.util.*;

public class FindModeInBinarySearchTree_501 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMode(new TreeNode(1,
                new TreeNode(0,
                        new TreeNode(0, new TreeNode(0), null),
                        new TreeNode(0)
                ), new TreeNode(1, new TreeNode(1), new TreeNode(1))
        ))));
    }

    private static int[] findMode(TreeNode root) {

        Map<Integer, Integer> quantities = new HashMap<>();
        List<Integer> modes = new ArrayList<>();
        deep(root, quantities, modes, new int[]{0});
        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }
        return result;
    }

    private static void deep(TreeNode root, Map<Integer, Integer> quantities, List<Integer> modes, int[] max) {
        if (root == null) return;

        int count = quantities.getOrDefault(root.val, 0) + 1;
        quantities.put(root.val, count);
        if (count > max[0]) {
            modes.clear();
            modes.add(root.val);
            max[0] = count;
        } else if (count == max[0]) {
            modes.add(root.val);
        }
        deep(root.left, quantities, modes, max);
        deep(root.right, quantities, modes, max);
    }
}
