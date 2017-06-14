/*
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ���
 */
public class Solution_32 {
    public int countDigitOne(int n) {
    	if(n <= 0) return 0;
        int length = 0;
        int high = n;
        for(int num = n; num != 0; num /= 10){
            length ++;
            high = num;
        }
        //����21345
        int major = (int) Math.pow(10, length - 1) * high;
        int remian = n - major;
        //��0-20000
        int majorCount = getMajorCount(high, length);
        //��1345
        int remianCount = countDigitOne(remian);
        //��1��ͷ������1XXXX��ʽ���ֵĴ���������10000��
        int rest = (high == 1 && remian > 0? remian : 0);
        return majorCount + remianCount + rest;
    }
    
    public int getMajorCount(int high, int length){
        if(length == 1) return high == 0 ? 0 : 1;
        return (int) ((high == 1 ? 1 : Math.pow(10, length - 1)) + Math.pow(10, length - 2) * high * (length - 1));
    }
}
