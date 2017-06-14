
/*
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
public class Solution_52 {
    public int[] multiply(int[] A) {
    	int[] rets = new int[A.length];
    	rets[0] = 1;
    	for (int i = 1; i < rets.length; i++) {
			rets[i] = rets[i - 1] * A[i - 1];
		}
    	int last = A[A.length - 1];
    	for (int i = rets.length - 2; i >= 0; i--) {
    		rets[i] = last * rets[i];
    		last = last * A[i];
		}
    	return rets;
    }
}
