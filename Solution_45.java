/*
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�
 * HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ������,�и���Ϸ��������:
 * ����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,
 * ���Ҳ��ٻص�Ȧ��,��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....
 * ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
 * ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
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
