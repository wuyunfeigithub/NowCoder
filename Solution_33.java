/*
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
import java.util.Arrays;
import java.util.Comparator;

public class Solution_33 {
    public String PrintMinNumber(int [] numbers) {
    	String[] strs = new String[numbers.length];
    	for (int i = 0; i < strs.length; i++) {
			strs[i] = String.valueOf(numbers[i]);
		}
    	Arrays.sort(strs, new Comparator<String>() {
			public int compare(String o1, String o2) {
				String o1Head = o1.concat(o2);
				String o2Head = o2.concat(o1);
				return o1Head.compareTo(o2Head);
			}
		});
    	StringBuilder ret = new StringBuilder();
    	for (String str : strs) {
			ret.append(str);
		}
    	return ret.toString();
    }
}
