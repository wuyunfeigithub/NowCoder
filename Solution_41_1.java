/*
题目描述
输入一个递增排序的数组和一个数字S，在数组中查找两个数，是的他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。 
输出描述:
对应每个测试案例，输出两个数，小的先输出。
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
