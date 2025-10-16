package ru.mikhail.easy;

import ru.mikhail.utils.TreeNode;

public class ConvertSortedArrayToBinarySearchTree_108 {

    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[] {-10,-3,0,5,9}));
    }

    private static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return new TreeNode();

        return deep(nums, 0, nums.length - 1);
    }

    private static TreeNode deep(int[] nums, int leftInd, int rightInd) {
        if (leftInd > rightInd) return null;

        int mid = (leftInd + rightInd) / 2;

        TreeNode cur = new TreeNode(nums[mid]);
        cur.left = deep(nums, leftInd, mid - 1);
        cur.right = deep(nums, mid + 1, rightInd);

        return cur;
    }
}
