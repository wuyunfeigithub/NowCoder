//һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж�����������
public class Solution_09_2 {
    public int JumpFloor(int target) {
		int[] dp = new int[target + 1];
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= target; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target];
    }
}
