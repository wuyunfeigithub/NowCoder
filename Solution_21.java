import java.util.Stack;
/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
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
