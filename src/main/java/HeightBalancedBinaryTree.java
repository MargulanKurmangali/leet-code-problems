public class HeightBalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.left.left = new TreeNode(1);
        HeightBalancedBinaryTree heightBalancedBinaryTree = new HeightBalancedBinaryTree();
        System.out.println(heightBalancedBinaryTree.isBalanced(treeNode));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = checkValues(root.left);
        int right = checkValues(root.right);

        if (Math.abs(left - right)  < 2) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }


    private int checkValues(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(checkValues(root.left), checkValues(root.right));
    }
}
