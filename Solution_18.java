/*
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 * ��ps������Լ��������������һ�������ӽṹ��
 */
public class Solution_18 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	boolean ret = false;
    	if(root1 != null && root2 != null){
    		if(root1.val == root2.val)
    			ret = helper(root2, root1);
    		if(ret == false)
    			ret = HasSubtree(root1.left, root2);
    		if(ret == false)
    			ret = HasSubtree(root1.right, root2);
    	}
    	
    	return ret;
    }
    private boolean helper(TreeNode sub,TreeNode all){
    	if(sub == null) return true;
    	else if(all == null) return false;
    	else if(sub.val != all.val)	return false;
    	else {
    		boolean left = helper(sub.left, all.left);
    		boolean right = helper(sub.right, all.right);
    		return left && right;
    	}
    }
}
