import java.util.Stack;

/*
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
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
