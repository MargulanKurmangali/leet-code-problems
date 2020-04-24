import java.util.*;

public class TraversalOrder {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() != 0) {
            Node node = queue.poll();
            if (node == null) {
                continue;
            }
            res.add(node.val);
            if (node.children != null) {
                for (int i = 0; i < node.children.size() ; i++) {
                    queue.push(node.children.get(i));
                }
            }
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        List<Node> childs = new ArrayList<>();
        Node ch = new Node(3);
        List<Node> cchch = new ArrayList();
        ch.children = cchch;
        cchch.add(new Node(5));
        cchch.add(new Node(6));
        childs.add(ch);
        childs.add(new Node(2));

        Node four = new Node(4);
        List<Node> fourChild = new ArrayList<>();
        fourChild.add(new Node(7));
        childs.add(four);
        four.children = fourChild;
        node.children = childs;

        TraversalOrder traversalOrder = new TraversalOrder();
        traversalOrder.postorder(node);

    }
}
