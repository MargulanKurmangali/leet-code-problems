import sun.reflect.generics.tree.Tree;

public class Counsins {
    int xP;
    int xD;

    int yP;
    int yD;

    int dep = -9999999;

    public boolean isCousins(TreeNode root, int x, int y) {
        findDepAndParentX(root, x, 0, 0);
        dep = -999999;
        findDepAndParentY(root, y, 0, 0);

        if (xP != yP && xD == yD) {
            return true;
        }
        return false;
    }

    private void findDepAndParentX(TreeNode root, int x, int parent, int current) {
        if (root == null) {
            return;
        }
        current++;
        if (root.val == x) {
            xP = parent;
            xD = current;
            return;
        }
        findDepAndParentX(root.left, x, root.val, current);
        findDepAndParentX(root.right, x, root.val, current);
    }

    private void findDepAndParentY(TreeNode root, int y, int parent, int current) {
        if (root == null) {
            return;
        }
        current++;
        if (root.val == y) {
            yP = parent;
            yD = current;
            return;
        }
        findDepAndParentY(root.left, y, root.val, current);
        findDepAndParentY(root.right, y, root.val, current);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        /*
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        node.right.right = new TreeNode(4);
        node.right.left.right = new TreeNode(6);
        node.right.right.right = new TreeNode(5);*/

        Counsins counsins = new Counsins();
        System.out.println(counsins.isCousins(node, 4, 3));
    }
}
