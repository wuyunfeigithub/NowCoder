/*
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */

public class Solution_58 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
    	if(pNode == null)
    		return pNode;
    	// 1. pNode有右子树
    	if(pNode.right != null){
    		return getFirstRL(pNode);
    	}
    	// 2. pNode无右子树
    	else{
    		// 找到第一个祖先节点parent，pNode在的左子树中
    		return getImInFisrtLeftTreeParent(pNode);
    	}
    }
    
    private TreeLinkNode getFirstRL(TreeLinkNode root){
    	TreeLinkNode p = root.right;
    	while(p.left != null){
    		p = p.left;
    	}
    	return p;
    }
    
    private TreeLinkNode getImInFisrtLeftTreeParent(TreeLinkNode myself){
    	TreeLinkNode parent = myself.next;
    	while(parent != null && parent.left != myself){
    		myself = parent;
    		parent = myself.next;
    	}
    	return parent;
    }
}
