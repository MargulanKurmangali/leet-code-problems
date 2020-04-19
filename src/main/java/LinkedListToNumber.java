import java.util.List;

public class LinkedListToNumber {
    int indx = 1;
    int res = 0;
    public int getDecimalValue(ListNode head) {
        getVal(head);
        return res;
    }

    public void getVal(ListNode listNode) {
        if (listNode == null) {
            return;
        }
        getVal(listNode.next);
        if (listNode.val == 1) {
            res = res + indx;
        }
        indx = indx * 2;
    }

    public static void main(String[] args) {
        LinkedListToNumber linkedListToNumber = new LinkedListToNumber();
  //      ListNode listNode = new ListNode();
   //     listNode.next = new ListNode(0);
      //  listNode.next.next = new ListNode(1);
      //  listNode.next.next.next = new ListNode(0);
    //    System.out.println(linkedListToNumber.getDecimalValue(listNode));

    }
}
