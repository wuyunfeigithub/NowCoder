/*
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */

public class Solution_58 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
    	if(pNode == null)
    		return pNode;
    	// 1. pNode��������
    	if(pNode.right != null){
    		return getFirstRL(pNode);
    	}
    	// 2. pNode��������
    	else{
    		// �ҵ���һ�����Ƚڵ�parent��pNode�ڵ���������
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
