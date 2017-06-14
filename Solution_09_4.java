//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
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
