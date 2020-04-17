import java.util.LinkedList;
import java.util.List;

public class Flatten {
    List<Integer> arr = new LinkedList<>();

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatTheTree(root);
        int i = 0;
        root.val = arr.get(i);
        i++;
        TreeNode res = root;
        while (i < arr.size()) {
            root.right = new TreeNode(arr.get(i));
            root.left = null;
            i++;
            root = root.right;
        }

        root = res;
    }

    private void flatTheTree(TreeNode root) {
        if (root == null) return;

        arr.add(root.val);
        flatTheTree(root.left);
        flatTheTree(root.right);
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(5);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.right = new TreeNode(6);

        Flatten flatten = new Flatten();
        flatten.flatten(treeNode);

    }
}
