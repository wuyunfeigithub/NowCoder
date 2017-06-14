//输入一个链表，反转链表后，输出链表的所有元素。
public class Solution_16 {
	public ListNode ReverseList(ListNode head) {
    	ListNode dummy = new ListNode(0);
    	
    	while(head != null){
    		ListNode next = head.next;
    		head.next = dummy.next;
    		dummy.next = head;
    		head = next;
    	}
    	
    	return dummy.next;
    }
}
