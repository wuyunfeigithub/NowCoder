//统计一个数字在排序数组中出现的次数。

public class Solution_38 {
    public int GetNumberOfK(int [] array , int k) {
    	int ret = 0;
    	if(array != null && array.length != 0){
    		int firstPos = GetFirstK(array, k);
    		int lastPos = GetLastK(array, k);
    		ret = firstPos != -1 ? lastPos - firstPos + 1 : 0;
    	}    	
        return ret;
    }
    
    private int GetFirstK(int [] array , int k){
    	int pos = -1;
    	int low = 0, high = array.length - 1;
    	while(low <= high){
    		int mid = (low + high) / 2;
    		if(array[mid] < k){
    			low = mid + 1;
    		}
    		else if(array[mid] > k){
    			high = mid - 1;
    		}
    		else {
    			if(mid == 0 || array[mid - 1] != k){
    				pos = mid;
    				break;
    			}
    			else{
    				high = mid - 1;
    			}
    		}
    	}
    	return pos;
    }
    
    private int GetLastK(int [] array , int k){
    	int pos = -1;
    	int low = 0, high = array.length - 1;
    	while(low <= high){
    		int mid = (low + high) / 2;
    		if(array[mid] < k){
    			low = mid + 1;
    		}
    		else if(array[mid] > k){
    			high = mid - 1;
    		}
    		else {
    			if(mid == array.length - 1 || array[mid + 1] != k){
    				pos = mid;
    				break;
    			}
    			else{
    				low = mid + 1;
    			}
    		}
    	}
    	return pos;
    }
    
}
