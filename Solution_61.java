import java.util.ArrayList;
/*
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution_61 {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    	zigzagLevelOrderHelper(ret, pRoot, 0);
    	return ret;
    }
    private void zigzagLevelOrderHelper(ArrayList<ArrayList<Integer>> list, TreeNode root, int level){
        if(root == null) return;
        if(level > list.size() - 1)
            list.add(new ArrayList<Integer>());
        if(level % 2 == 0) list.get(level).add(root.val);
        else list.get(level).add(0, root.val);
        zigzagLevelOrderHelper(list, root.left, level + 1);
        zigzagLevelOrderHelper(list, root.right, level + 1);
    }
}
