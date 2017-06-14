import java.util.HashMap;
import java.util.Map;

/*
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

public class Solution_26 {
    public RandomListNode Clone1(RandomListNode pHead)
    {
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        for(RandomListNode p = pHead; p != null; p = p.next){
        	RandomListNode temp = new RandomListNode(p.label);
        	map.put(p, temp);
        }
        for(RandomListNode p = pHead; p != null; p = p.next){
        	RandomListNode temp = map.get(p);
        	temp.next = map.get(p.next);
        	temp.random = map.get(p.random);

        }
        return map.get(pHead);
    }
    
    
    public RandomListNode Clone(RandomListNode pHead)
    {
        for(RandomListNode p = pHead; p != null; ){
            RandomListNode temp = new RandomListNode(p.label);
            temp.next = p.next;
            p.next = temp;
             
            p = temp.next;
        }
         
        int count = 0;
        for(RandomListNode p = pHead; p != null; p = p.next, count++){
            if((count & 1) == 0 && p.random != null){
                p.next.random = p.random.next;
            }
        }
         
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode rear = dummy;
        RandomListNode rearOld = pHead;
        count = 0;
        for(RandomListNode p = pHead; p != null; p = p.next, count++){
            if((count & 1) == 1){
                rear.next = p;
                rear = rear.next;
            }
            else if(count != 0){
                rearOld.next = p;
                rearOld = rearOld.next;
            }
        }
        if(rearOld != null)
            rearOld.next = null;
         
        return dummy.next;
    }

}
