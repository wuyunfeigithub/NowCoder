/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution_24 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        return sequence.length == 0 ? false : helper(sequence, 0, sequence.length);
    }
    
    private boolean helper(int [] sequence, int start, int length){
    	if(length == 0) return true;
        int root = sequence[start + length - 1];
        int leftLen = 0, rightLen = 0;
        int i = start;
        for(; i < start + length && sequence[i] < root; i++, leftLen++);
        for(; i < start + length && sequence[i] > root; i++, rightLen++);
        boolean ret = (leftLen + rightLen + 1) == length;
        boolean leftRet = true, rightRet = true;
        if(ret){
            leftRet = helper(sequence, start, leftLen);
            rightRet = helper(sequence, start + leftLen, rightLen);
        }
        return ret && leftRet && rightRet;
    }
}
