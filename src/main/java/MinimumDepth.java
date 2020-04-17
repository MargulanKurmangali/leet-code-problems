public class MinimumDepth {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.left.left = new TreeNode(10);
        treeNode.right = new TreeNode(1);
        treeNode.right.right = new TreeNode(2);
        treeNode.right.right.right = new TreeNode(4);
        MinimumDepth minimumDepth = new MinimumDepth();
        System.out.println(minimumDepth.minDepth(treeNode));
    }

    int dep = 99999;

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        countDepth(root, 0);
        return dep;
    }

    public void countDepth(TreeNode root, int current) {
        if (root == null) {
            return;
        }
        current++;
        if (dep > current && root.left == null && root.right == null) {
            dep = current;
            return;
        }

        countDepth(root.left, current);
        countDepth(root.right, current);
    }
}
