//����һ����������������е�����k����㡣
public class Solution_15 {
    public ListNode FindKthToTail(ListNode head,int k) {
    	if(k == 0) return null;
    	ListNode first = head, second = head;
    	for (int i = 0; i < k - 1 && first != null; i++, first = first.next);
    	if(first == null) return first;
    	while(first.next != null){
    		first = first.next;
    		second = second.next;
    	}
    	return second;
    }
}
