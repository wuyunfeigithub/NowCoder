
public class Solution_56 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow = pHead;
        ListNode fast = pHead;
        while(fast != null && fast.next != null){
        	slow = slow.next;
        	fast = fast.next.next;
        	if(slow == fast){
        		slow = pHead;
        		while(slow != fast){
        			slow = slow.next;
        			fast = fast.next;
        		}
        		return fast;
        	}
        }
        return null;
    }
}
