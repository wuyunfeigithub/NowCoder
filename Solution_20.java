import java.util.ArrayList;
import java.util.List;

/*
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class Solution_20 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
    	ArrayList<Integer> rets = new ArrayList<>();
    	
    	int rows = matrix.length;
    	if(rows == 0) return rets;
    	int cols = matrix[0].length;
    	
    	for (int i = 0; i * 2 < rows && i * 2 < cols; i++) {
			printSingleLoop(rets, matrix, i, cols, rows);
		}
    	
    	return rets;
    }
    
    private void printSingleLoop(List<Integer> rets, int[][] matrix, int start, int cols, int rows){
    	int end_i = rows - 1 - start;
    	int end_j = cols - 1 - start;
    	
    	if(start <= end_j){
    		for (int i = start; i <= end_j; i++) {
				rets.add(matrix[start][i]);
			}
    	}
    	
    	if(start + 1 <= end_i){
    		for (int i = start + 1; i <= end_i; i++) {
				rets.add(matrix[i][end_j]);
			}
    	}
    	
    	if(start <= end_j - 1 && start < end_i){
    		for (int i = end_j - 1; i >= start; i--) {
				rets.add(matrix[end_i][i]);
			}
    	}
    	
    	if(start + 1 <= end_i - 1 && start < end_j){
    		for (int i = end_i - 1; i >= start + 1; i--) {
				rets.add(matrix[i][start]);
			}
    	}
    	
    }
    
}
