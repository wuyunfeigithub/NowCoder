/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 */
public class Solution_31 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 0;
        int ret = 0;
        for(int i = 0; i < array.length; i++){
            if(count == 0){
                ret = array[i];
                count++;
            }
            else{
                if(ret == array[i])
                    count++;
                else
                    count--;
            }
        }
        count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == ret)
                count++;
        }
        return 2 * count > array.length ? ret : 0;
    }
}
