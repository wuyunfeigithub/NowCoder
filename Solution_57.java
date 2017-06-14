/*
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬
 * �ظ��Ľ�㲻��������������ͷָ�롣 
 * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
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
