//����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
public class Solution_10 {
    public int NumberOf1(int n) {
        int ret = 0;
         
        for(int i = 0; i < 32; i++){
            ret += n & 1;
            n >>= 1;
        }
         
        return ret;
    }
}
