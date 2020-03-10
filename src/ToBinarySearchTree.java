public class ToBinarySearchTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode treeNode = getTreeNode(nums, 0, nums.length - 1);
        return treeNode;
    }

    private TreeNode getTreeNode(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        int middle = (i + j) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = getTreeNode(nums, i, middle - 1);
        root.right = getTreeNode(nums, middle + 1, j);

        return root;
    }

    void printValues(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        printValues(node.left);
        printValues(node.right);
    }


    public static void main(String[] args) {
        ToBinarySearchTree toBinaryTree = new ToBinarySearchTree();
        int nums[] = {-10, -3, 0, 5, 9};
        TreeNode result = toBinaryTree.sortedArrayToBST(nums);
        toBinaryTree.printValues(result);
    }
}
