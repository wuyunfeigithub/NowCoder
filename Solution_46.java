//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
public class Solution_46 {
    public int Sum_Solution(int n) {
    	int ans = n;
        boolean door = (n != 0) && (ans += Sum_Solution(n - 1)) == 0;
        return ans;
    }
}
