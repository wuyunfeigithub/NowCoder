/*
 * 输入两个链表，找出它们的第一个公共结点
 */
public class Solution_37 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	 int len1 = getLen(pHead1);
    	 int len2 = getLen(pHead2);
    	 ListNode longP = len1 > len2 ? pHead1 : pHead2;
    	 ListNode shortP = len1 > len2 ? pHead2 : pHead1;
    	 for(int i = 0; i < Math.abs(len1 - len2); longP = longP.next,i++);
    	 for(; longP != shortP; longP = longP.next, shortP = shortP.next);
    	 return longP;
    }
    
    private int getLen(ListNode head){
    	int len = 0;
    	for(ListNode p = head; p != null; len++, p = p.next);
    	return len;
    }
}
