public class MaxDepth {
    int dep = -999999;

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        countDepth(root, 0);
        return dep;
    }

    public void countDepth(Node root, int current) {
        if (root == null) {
            return;
        }
        current++;
        if (dep < current) {
            dep = current;
        }
        if (root.children != null) {
            for (Node child : root.children) {
                countDepth(child, current);
            }
        }
    }
}
