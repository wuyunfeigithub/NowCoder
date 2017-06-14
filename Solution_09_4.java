//���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
public class Solution_09_4 {
    public int RectCover(int target) {
        if(target == 0) return 0;
		int[] dp = new int[target + 1];
        dp[0] = dp[1] = 1;
        for(int i = 2; i <= target; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[target];
    }
}
