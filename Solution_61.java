import java.util.ArrayList;
/*
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
 * �ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
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
