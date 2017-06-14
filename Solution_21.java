import java.util.Stack;
/*
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 */

public class Solution_21 {
	
	Stack<Integer> data = new Stack<>();
	Stack<Integer> min = new Stack<>();
	
    public void push(int node) {
        int minEle = min.isEmpty() ? node : min.peek();
        data.push(node);
        min.push(Math.min(node, minEle));
    }
    
    public void pop() {
        data.pop();
        min.pop();
    }
    
    public int top() {
        return data.peek();
    }
    
    public int min() {
        return min.peek();
    }
}
