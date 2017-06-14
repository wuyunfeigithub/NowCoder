/*
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class Solution_54 {
	
	public static void main(String[] args){
		Solution_54 solution = new Solution_54();
		char[] arr = "+1.1e+1".toCharArray();
		System.out.println(solution.isNumeric(arr));
	}
	
    public boolean isNumeric(char[] str) {
        int ePos = 0;
        while(ePos < str.length){
        	char c = str[ePos++];
        	if( c == 'e' || c == 'E')
        		break;
        }
        return isNorMalNumber(str, 0, ePos < str.length ? ePos - 2 : ePos - 1) && (ePos >= str.length || isInteger(str, ePos, str.length - 1));
    }
    
    private boolean isInteger(char[] str, int start, int end){
    	if(start > end) return false;
    	if(str[start] == '-' || str[start] == '+')
			start++;
    	if(start > end) return false;
    	for (int i = start; i <= end; i++) {
    		char c = str[i];
			if(c > '9' || c < '0')
				return false;
		}
    	return true;
    }
    
    private boolean isNorMalNumber(char[] str, int start, int end){
    	if(start > end) return false;
    	if(str[start] == '-' || str[start] == '+')
			start++;
    	if(start > end) return false;
    	boolean findDot = false;
    	for (int i = start; i <= end; i++) {
    		char c = str[i];
			if(c == '.'){
				if(start == end)
					return false;
				if(findDot == false){
					findDot = true;
					continue;
				}
				else
					return false;
			}
			if(c > '9' || c < '0')
				return false;
		}
    	return true;
    }
}
