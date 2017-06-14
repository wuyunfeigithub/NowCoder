//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
public class Solution_11 {
	
    public double myPow(double base, int exponent){
		if(exponent == 0) return 1;
		long newExp = exponent;
		if(exponent < 0){
			base = 1 / base;
			newExp = -newExp;
		}
		return (newExp & 1) == 1 ? base * myPow(base * base, (int)(newExp / 2)) : myPow(base * base, (int)(newExp / 2));
	}
	
	
    public double Power1(double base, int exponent){
        if(exponent == 0) return 1;
        if(equal(0, base)) return 0;
        boolean isNegative = false;
        double ret = 1;
        if(exponent < 0) {
            isNegative = true;
            exponent = -exponent;
        }
        for(int i = 0; i < exponent; i++){
            ret *= base;
        }
        return isNegative ? 1 / ret : ret;
    }
    
    private boolean equal(double num1, double num2){
        if( (num1 - num2) > -0.0000001 && (num1 - num2) < 0.0000001 )	return true;
        return false;
    }

}
