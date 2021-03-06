//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
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
