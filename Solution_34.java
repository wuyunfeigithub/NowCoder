/*
 * ��ֻ��������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ����������7�� 
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */

public class Solution_34 {
    public int GetUglyNumber_Solution(int index) {
    	int[] uglys = new int[index + 2];
    	uglys[1] = 1;
    	int index2 = 1, index3 = 1, index5 = 1;
    	int factor2 = 2, factor3 = 3, factor5 = 5;
    	
    	for (int i = 2; i <= index; i++) {
			uglys[i]= Math.min(Math.min(factor2, factor3), factor5);
			if(uglys[i] == factor2)
				factor2 = 2 * uglys[++index2];
			if(uglys[i] == factor3)
				factor3 = 3 * uglys[++index3];
			if(uglys[i] == factor5)
				factor5 = 5 * uglys[++index5];
		}    	
        return uglys[index];
    }
}
