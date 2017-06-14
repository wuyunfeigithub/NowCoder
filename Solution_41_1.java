/*
��Ŀ����
����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ� 
�������:
��Ӧÿ�����԰����������������С���������
 */
import java.util.ArrayList;

public class Solution_41_1 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> rets = new ArrayList<>();
        int start = 0;
        int end = array.length - 1;
        while(start < end) {
			if(array[start] + array[end] == sum){
				rets.add(array[start]);
				rets.add(array[end]);
				break;
			}
			else if(array[start] + array[end] < sum){
				start++;
			}
			else{
				end--;
			}
		}
        return rets;
    }
}
