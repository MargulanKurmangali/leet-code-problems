import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderSearchTree {
    List<Integer> values = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        getValues(root);
        TreeNode temp = new TreeNode(1);
        TreeNode res = temp;
        Collections.sort(values);
        for (Integer value : values) {
            temp.right = new TreeNode(value);
            temp = temp.right;
        }

        return res.right;
    }

    private void getValues(TreeNode root) {
        if (root == null) {
            return;
        }
        getValues(root.left);
        getValues(root.right);
        values.add(root.val);
    }
}
