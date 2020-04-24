import java.util.LinkedList;

public class SearchBinaryTree {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode res = null;
        if (root == null) {
            return null;
        }

        LinkedList<TreeNode> node = new LinkedList<>();
        node.add(root);
        while (node.size() > 0) {
            TreeNode treeNode = node.poll();
            if (treeNode == null) {
                continue;
            }
            if (treeNode.val == val) {
                res = treeNode;
                break;
            } else {
                node.add(treeNode.left);
                node.add(treeNode.right);
            }
        }

        return res;
    }
}
