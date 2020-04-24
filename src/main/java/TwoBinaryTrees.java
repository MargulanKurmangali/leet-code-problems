public class TwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        TreeNode res = new TreeNode((t1 == null ? 0 : t1.val)  + (t2 == null ? 0 : t2.val));
        res.left = mergeTrees((t1 == null ? null : t1.left),(t2 == null ? null : t2.left));
        res.right = mergeTrees((t1 == null ? null : t1.right),(t2 == null ? null : t2.right));

        return res;
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(5);

        TreeNode treeNode2 = new TreeNode(2);
        treeNode2.left = new TreeNode(1);
        treeNode2.right = new TreeNode(3);
        treeNode2.right.right = new TreeNode(7);
        treeNode2.left.right = new TreeNode(4);

        TwoBinaryTrees twoBinaryTrees = new TwoBinaryTrees();
        twoBinaryTrees.mergeTrees(treeNode, treeNode2);
    }
}
