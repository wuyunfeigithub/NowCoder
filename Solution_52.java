
/*
 * ����һ������A[0,1,...,n-1],�빹��һ������B[0,1,...,n-1],
 * ����B�е�Ԫ��B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]��
 * ����ʹ�ó�����
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
