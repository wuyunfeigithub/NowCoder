import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */

public class Solution_30 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	ArrayList<Integer> rets = new ArrayList<>();
    	if(k > input.length || k == 0) return rets;
    	
    	PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
    	
    	for (int i = 0; i < k; i++) {
			pq.add(input[i]);
		}
    	for (int i = k; i < input.length; i++) {
    		int peek = pq.peek();
    		if(peek > input[i]){
    			pq.poll();
    			pq.add(input[i]);
    		}
		}
    	
    	for(int ele : pq){
    		rets.add(ele);
    	}
    	
    	return rets;
    }
}
