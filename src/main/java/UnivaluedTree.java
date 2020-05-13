import java.util.ArrayList;
import java.util.List;

public class UnivaluedTree {
    List<Integer> values = new ArrayList<>();

    public boolean isUnivalTree(TreeNode root) {
        getValues(root);
        int prev = values.get(0);
        for (Integer value : values) {
            if (prev != value) {
                return false;
            }

        }
        return true;
    }

    private void getValues(TreeNode root) {
        if (root== null) {
            return;
        }
        values.add(root.val);
        getValues(root.left);
        getValues(root.right);
    }


}
