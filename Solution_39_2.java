//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
public class Solution_39_2 {
	public boolean IsBalanced_Solution(TreeNode pRoot) {
		return helper(pRoot) >= 0;
	}

	private int helper(TreeNode pRoot) {
		if (pRoot == null) {
			return 0;
		}
		int left = helper(pRoot.left);
		int right = helper(pRoot.right);
		if ( left >= 0 && right >= 0) {
			if (Math.abs(left - right) <= 1) {
				return Math.max(left, right) + 1;
			}
		}
		return -1;
	}
}
