package ua.java.dsa.leetcode;
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2,new TreeNode(3), new TreeNode(4)),
                new TreeNode(2,new TreeNode(4), new TreeNode(3))
        );
        TreeNode root1 = new TreeNode(
                1,
                new TreeNode(2,new TreeNode(3), new TreeNode(4)),
                new TreeNode(2,new TreeNode(1), new TreeNode(3))
        );
        System.out.println(isSymmetric(root));
        System.out.println(isSymmetric(root1));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null || right == null) return left==right;
        return left.val == right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    static class TreeNode  {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
