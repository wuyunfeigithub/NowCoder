import java.util.ArrayList;

/*
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
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
