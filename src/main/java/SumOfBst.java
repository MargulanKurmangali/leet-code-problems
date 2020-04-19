public class SumOfBst {
    public int res = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        findValues(root, L, R);
        System.out.println(res);
        return res;


    }

    public static void main(String[] args) {
     /*   TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(7);
        treeNode.left.right.left = new TreeNode(6);
        treeNode.left.left.left = new TreeNode(1);

        treeNode.right = new TreeNode(15);
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(18);
*/

        SumOfBst sumOfBst = new SumOfBst();
        System.out.println(sumOfBst.maximum69Number(9669));
        //      sumOfBst.rangeSumBST(treeNode, 7, 15);

    }

    public int maximum69Number(int num) {
        String a = String.valueOf(num);
        a.replaceFirst("6","9");
        return Integer.valueOf(a);
    }


    private void findValues(TreeNode root, int left, int right) {
        if (root == null) return;

        if (root.val <= right && root.val >= left) {
            res = res + root.val;
        }

        if (root.val >= left) {
            findValues(root.left, left, right);
        }
        if (root.val <= right) {
            findValues(root.right, left, right);
        }

    }

    private void findValuesRight(TreeNode root, int target) {
        if (root == null) {
            return;
        }
        if (root.val < target) {
            res = res + root.val;
        }
        if (root.val == target) {
            res = res + root.val;
            return;
        }

        findValuesRight(root.left, target);
        findValuesRight(root.right, target);

    }
}
