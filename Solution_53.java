public class Solution_53 {
    public boolean match(char[] str, char[] pattern)
    {
        if(str == null || pattern == null)
        	return false;
        return helper(str, pattern, 0, 0);
    }
    
    private boolean helper(char[] str, char[] pattern, int strPos, int patternPos){
    	if(patternPos == pattern.length){
    		return strPos == str.length;
    	}
    	//pattern.length剩余 > 1
    	//下一位为*，需要特殊处理
    	if(patternPos < pattern.length - 1 && pattern[patternPos + 1] == '*'){
    		if(strPos < str.length && (str[strPos] == pattern[patternPos] || (pattern[patternPos] == '.'))){
    			return helper(str, pattern, strPos + 1, patternPos + 2)
    					|| helper(str, pattern, strPos + 1, patternPos)
    					|| helper(str, pattern, strPos, patternPos + 2);
    		}
    		else{
    			return helper(str, pattern, strPos, patternPos + 2);
    		}
    	}
    	if(strPos < str.length && (str[strPos] == pattern[patternPos] || pattern[patternPos] == '.'))
    		return helper(str, pattern, strPos + 1, patternPos + 1);
    	return false;
    }
}
