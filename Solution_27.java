import java.util.ArrayList;
import java.util.List;

public class Solution_27 {
    public TreeNode Convert1(TreeNode pRootOfTree) {
    	if(pRootOfTree == null)	return pRootOfTree;
    	ArrayList<TreeNode> sortedArr = new ArrayList<>();
    	inOrder(pRootOfTree, sortedArr);
    	for (int i = 0; i < sortedArr.size(); i++) {
			TreeNode next = i + 1 < sortedArr.size() ? sortedArr.get(i+1) : null;
			TreeNode cur = sortedArr.get(i);
			cur.right = next;
			if(next != null){
				next.left = cur;
			}
		}
		return sortedArr.get(0);
        
    }
    
    private void inOrder(TreeNode root, List<TreeNode> sortedArr){
    	if(root != null){
    		inOrder(root.left, sortedArr);
    		sortedArr.add(root);
    		inOrder(root.right, sortedArr);
    	}
    }
    
    
    
    public TreeNode Convert(TreeNode pRootOfTree) {
    	if(pRootOfTree == null) 
    		return null;
    	
    	TreeNode pre = Convert(pRootOfTree.left);
    	TreeNode next = Convert(pRootOfTree.right);
    	
    	TreeNode last = pre;
    	for(; last != null && last.right != null; last = last.right);
    	
    	pRootOfTree.right = next;
    	pRootOfTree.left = last;
    	if(last != null){
    		last.right = pRootOfTree;
    	}  
    	if(next != null){
    		next.left = pRootOfTree;
    	}
    	return pre == null ? pRootOfTree : pre;
    }
}
