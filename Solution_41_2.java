/*
 * С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,
 * �����Ͼ�д������ȷ����100�����������������ڴ�,
 * �����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
 * û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
 * ���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������?
 *  Good Luck! 
 */
import java.util.ArrayList;

public class Solution_41_2 {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer>> rets = new ArrayList<>();
    	int start = 1;
    	int end = 2;
    	while(start * 2 < sum && start < end) {
    		int curSum = (end - start + 1) * (start + end) / 2;
    		if(curSum == sum){
    			ArrayList<Integer> ret = new ArrayList<>();
    			for (int i = start; i <= end; i++) {
    				ret.add(i);
				}
    			rets.add(ret);
    			start++;
    		}
    		else if(curSum > sum){
    			start++;
    		}
    		else{
    			end++;
    		}
    	}
    	return rets;
    }
}
