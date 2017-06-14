/*
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数
 */
public class Solution_32 {
    public int countDigitOne(int n) {
    	if(n <= 0) return 0;
        int length = 0;
        int high = n;
        for(int num = n; num != 0; num /= 10){
            length ++;
            high = num;
        }
        //假设21345
        int major = (int) Math.pow(10, length - 1) * high;
        int remian = n - major;
        //算0-20000
        int majorCount = getMajorCount(high, length);
        //算1345
        int remianCount = countDigitOne(remian);
        //若1开头，算以1XXXX形式出现的次数（除了10000）
        int rest = (high == 1 && remian > 0? remian : 0);
        return majorCount + remianCount + rest;
    }
    
    public int getMajorCount(int high, int length){
        if(length == 1) return high == 0 ? 0 : 1;
        return (int) ((high == 1 ? 1 : Math.pow(10, length - 1)) + Math.pow(10, length - 2) * high * (length - 1));
    }
}
