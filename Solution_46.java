//��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
public class Solution_46 {
    public int Sum_Solution(int n) {
    	int ans = n;
        boolean door = (n != 0) && (ans += Sum_Solution(n - 1)) == 0;
        return ans;
    }
}
