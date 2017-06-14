//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Solution_17 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode dummy = new ListNode(0), tail = dummy;
        
        while(list1 != null && list2 != null){
            ListNode p = null;
            if(list1.val < list2.val){
                p = list1;
                list1 = list1.next;
            }
            else{
            	p = list2;
                list2 = list2.next;
            }
            tail.next = p;
            tail = p;
        }
        if(list2 != null) list1 = list2;
        tail.next = list1;
        return dummy.next;
    }
}
