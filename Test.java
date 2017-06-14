import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	private static int x = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_63 solution = new Solution_63();
		int[] a = {1,2,3,4,5};
		

		
//		int[] b = {2,4,3,6,3,2,5,5};
//		int[] c = {0};
//		int[] d = {0};
//		solution.FindNumsAppearOnce(b, c, d);
//		int x = 6;
//		x &= -x;
		TreeNode node = new TreeNode(8);
		TreeNode node1 = new TreeNode(6);
		TreeNode node2 = new TreeNode(10);
		TreeNode node3 = new TreeNode(5);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(9);
		TreeNode node6 = new TreeNode(11);
		
		node.left = node1;
		node.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		System.out.println(solution.KthNode(node, 1).val);
	}
	
	
}
