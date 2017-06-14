//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
public class Solution_09_1 {
    public int Fibonacci(int n) {
		int[] ret = new int[40];
        ret[1] = ret[2] = 1;
        for(int i = 3; i <= n; i++){
            ret[i] = ret[i - 1] + ret[i - 2];
        }
        return ret[n];
    }
}
