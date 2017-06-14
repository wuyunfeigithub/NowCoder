/*
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution_03 {
	
	public static void main(String[] args){
		int[][] nums = {{1, 2, 8, 9},
						{2, 4, 9, 12},
						{4, 7, 10, 13},
						{6, 8, 11, 15}};
		Solution_03 solution = new Solution_03();
		System.out.println(solution.Find(7, nums));
		
	}
	
    public boolean Find(int target, int [][] array) {
    	if(array.length == 0)	return false;
    	return binarySearch(target, array, 0, array.length - 1, 0, array[0].length - 1);
    }
    
    private boolean binarySearch(int target, int [][] array, int i_start, int i_end, int j_start, int j_end){
    	if(i_start > i_end || j_start > j_end)	return false;
    	int i_mid = (i_start + i_end) / 2;
    	int j_mid = (j_start + j_end) / 2;
    	if(target == array[i_mid][j_mid]){
    		return true;
    	}
    	else if(target < array[i_mid][j_mid]){
    		return binarySearch(target, array, i_start, i_mid - 1, j_start, j_mid - 1) ||
    			   binarySearch(target, array, i_start, i_mid - 1, j_mid, j_end) ||
    			   binarySearch(target, array, i_mid, i_end, j_start, j_mid - 1);
    	}
    	else{
    		return binarySearch(target, array, i_mid + 1, i_end, j_mid + 1, j_end) ||
     			   binarySearch(target, array, i_mid + 1, i_end, j_start, j_mid) ||
     			   binarySearch(target, array, i_start, i_mid, j_mid + 1, j_end);
    	}
    }
}
