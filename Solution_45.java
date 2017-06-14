/*
 * 每年六一儿童节,牛客都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
 * HF作为牛客的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:
 * 首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,
 * 并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....
 * 直到剩下最后一个小朋友,可以不用表演,并且拿到牛客名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。
 * 请你试着想下,哪个小朋友会得到这份礼品呢？(注：小朋友的编号是从0到n-1)
 */
public class Solution_45 {
	private class Node{
		int val;
		Node next;
		Node pre;
		public Node (int val){
			this.val = val;
		}
	}
	
    public int LastRemaining_Solution(int n, int m) {
        if(n < 1 || m < 1)
        	return -1;
        Node dummy = new Node(0);
        Node tail = dummy;
        for (int i = 0; i < n; i++) {
			Node newNode = new Node(i);
			tail.next = newNode;
			newNode.pre = tail;
			tail = newNode;
		}
        tail.next = dummy.next;
        dummy.next.pre = tail;
        
        Node p = dummy.next;
        int count = 0;
        while(p.next != p){
        	if((++count) % m == 0){
        		p.pre.next = p.next;
        		p.next.pre = p.pre;
        		print(p.next);
        	}
        	p = p.next;
        }
        return p.val;
    }
    
    
    
    public void print(Node head){
    	Node tail = head.pre;
    	Node p = head;
    	while(p != tail)
    	{
    		System.out.print(p.val + "->");
    		p = p.next;
    	}
    	System.out.print(tail.val+"\n");
    }
}
