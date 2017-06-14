import java.util.ArrayList;

//从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。

public class Solution_60 {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    	helper(ret, pRoot, 0);    	
    	return ret;
    }
	private void helper(ArrayList<ArrayList<Integer>> ret, TreeNode root, int level){
		if(root == null)
			return;
		if(level > ret.size() - 1)
			ret.add(new ArrayList<Integer>());
		ret.get(level).add(root.val);
		helper(ret, root.left, level + 1);
		helper(ret, root.right, level + 1);
	}
}
