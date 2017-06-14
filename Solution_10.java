//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Solution_10 {
    public int NumberOf1(int n) {
        int ret = 0;
         
        for(int i = 0; i < 32; i++){
            ret += n & 1;
            n >>= 1;
        }
         
        return ret;
    }
}
