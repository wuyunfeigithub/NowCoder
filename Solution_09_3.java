//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n���������������һ��n����̨���ܹ��ж�����������
public class Solution_09_3 {
    public int JumpFloorII(int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int i = 1; i <= target; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }
}
