import java.util.ArrayList;
import java.util.List;

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head!=null) {
            list.add(head.val);
            head = head.next;
        }
        ListNode res = new ListNode(1);
        ListNode temp = res;
        for (int i = list.size()/2; i < list.size(); i++) {
            res.next = new ListNode(list.get(i));
            res = res.next;
        }

        return temp.next;
    }
}
