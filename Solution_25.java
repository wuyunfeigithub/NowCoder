import java.util.ArrayList;

/*
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */

public class Solution_25 {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    	ArrayList<ArrayList<Integer>> rets = new ArrayList<>(); 
    	if(root == null)	return rets;
    	ArrayList<Integer> path = new ArrayList<>();
    	findPath(root, 0, path, rets, target);
    	return rets;
    }
    
    private void findPath(TreeNode root, int sum, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> rets, int target){
        TreeNode cur = root;
        sum += cur.val;
        path.add(cur.val);
        boolean isLeaf = cur.left == null && cur.right == null;
        
        if(sum == target && isLeaf){
            rets.add(new ArrayList<Integer>(path));
        }
        
        if(cur.left != null)	findPath(cur.left, sum, path, rets, target);
        if(cur.right != null)	findPath(cur.right, sum, path, rets, target);
        
        path.remove(path.size() - 1);
    }
}
