//请实现两个函数，分别用来序列化和反序列化二叉树
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_62 {

	String spliter = ",";
	String NN = "#";

	String Serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		buildString(root, sb);
		return sb.toString();
	}

	TreeNode Deserialize(String str) {
		Queue<String> queue = new LinkedList<>();
		queue.addAll(Arrays.asList(str.split(spliter)));
		return buildTree(queue);
	}

	private StringBuilder buildString(TreeNode root, StringBuilder builder) {
		if (root == null) {
			builder.append(NN).append(spliter);
		} else {
			builder.append(root.val).append(spliter);
			buildString(root.left, builder);
			buildString(root.right, builder);
		}
		return builder;
	}
	
	private TreeNode buildTree(Queue<String> queue){
		String val = queue.remove();
		if(val.equals(NN)){
			return null;
		}
		else {
			TreeNode root = new TreeNode(Integer.valueOf(val));
			root.left = buildTree(queue);
			root.right = buildTree(queue);
			return root;
		}
	}
}
