/*
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0 
 * 
 * note : null, "", "+", "-", >Integer.MAX_VALUE, <Integer.MIN_VALUE
 */
public class Solution_49 {
    public int StrToInt(String str) {
        return isValid(str) ? (int)atoi(str) : 0;
    }
    
    private boolean isValid(String str) {
    	if(str == null || str.equals("") || str.equals("+") || str.equals("-")){
    		return false;
    	}
    	else{
    		for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(i == 0 && (c == '+' || c == '-'))
					continue;
				if(c > '9' || c <'0')
					return false;
			}
    	}
    	return true;
    }
    
    private long atoi(String str){
    	int minus = 1;
    	long ret = 0;
    	long max = 0x7FFFFFFF;
    	long min = 0x80000000;
    	if(str.charAt(0) == '-')
    		minus = -1;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == '+' || c == '-')
				continue;
			ret = ret * 10 + (c - '0');
			if(minus * ret > max || minus * ret < min)
				return 0;
		}
		return ret * minus;
    }
}
