import java.util.Stack;

/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 */
public class Solution_22 {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		int pushRestIndex = 0;
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < popA.length; i++) {
			int cur = popA[i];
			if (!stack.isEmpty() && stack.peek() == cur) {
				stack.pop();
			} else {
				while (pushRestIndex < pushA.length && pushA[pushRestIndex] != cur) {
					stack.push(pushA[pushRestIndex++]);
				}
				pushRestIndex++;
				if (pushRestIndex >= pushA.length && pushA[pushA.length - 1] != cur)
					return false;
			}
		}
		return true;
	}
}
