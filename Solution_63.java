/*
 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
 * ���磬 5 
 * 		/ \ 
 * 	   3   7 
 * 	  /\   /\ 
 * 	 2  4 6  8 �У�
 * �������ֵ��С˳�����������ֵΪ4��
 */
public class Solution_63 {
	//method 1
	int count = 0;

	public TreeNode KthNode(TreeNode root, int k) {
		if (root == null || k == 0)
			return null;
		TreeNode left = KthNode(root.left, k);
		if (left != null)
			return left;
		if ((++count) == k)
			return root;
		TreeNode right = KthNode(root.right, k);
		if (right != null)
			return right;
		return null;
	}
	//method 2
	TreeNode KthNode1(TreeNode root, int k) {
		if (k == 0 || (root == null && k > 0))
			return null;
		int count = getTreeNodeSize(root.left);
		if (k <= count)
			return KthNode1(root.left, k);
		else if (k > count + 1)
			return KthNode1(root.right, k - count - 1);
		else
			return root;
	}

	private int getTreeNodeSize(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + getTreeNodeSize(root.left) + getTreeNodeSize(root.right);
	}
}
