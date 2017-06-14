/*
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
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
