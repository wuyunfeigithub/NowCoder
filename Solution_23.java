import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Solution_23 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> rets = new ArrayList<>();
    	
    	Queue<TreeNode> queue = new LinkedList<>();
    	TreeNode p = root;
    	if(p != null) queue.add(p);
    	
    	while(!queue.isEmpty()){
    		//visit
    		p = queue.poll();
    		rets.add(p.val);
    		
    		if(p.left != null)	queue.add(p.left);
    		if(p.right != null) queue.add(p.right);
    	}
    	
		return rets;
    }
}
