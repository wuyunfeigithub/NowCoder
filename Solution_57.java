/*
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution_57 {
    public ListNode deleteDuplication(ListNode pHead)
    {
    	if(pHead == null)
    		return pHead;
    	ListNode dummy = new ListNode(0);
    	dummy.next = pHead;
    	ListNode pre = dummy;
    	ListNode p = pre.next;
    	while(p != null && p.next != null){
    		ListNode diff = p;
    		while(diff != null && diff.val == p.val){
    			diff = diff.next;
    		}
    		if(p.next != diff){
    			pre.next = diff;
    			p = diff;
    		}
    		else{
    			pre = p;
    			p = p.next;
    		}
    	}
    	return dummy.next;
    }
}
