//��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�n<=39
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
