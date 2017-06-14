/*
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 * ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 * ���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
 * ��ȷ�ľ���Ӧ���ǡ�I am a student.����
 * Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
public class Solution_42_1 {
    public String ReverseSentence(String str) {
        char[] strArr = str.toCharArray();
        reverse(strArr, 0, str.length() - 1);
        
        for (int start = 0; start < strArr.length; start++) {
			if(strArr[start] == ' ')
				continue;
			int end = start;
			for (; end < strArr.length && strArr[end] != ' '; end++);
			end--;
			reverse(strArr, start, end);
			start = end;
		}
        return new String(strArr);
    }
    private void reverse(char[] arr, int start, int end){
    	while(start < end){
    		char temp = arr[start];
    		arr[start] = arr[end];
    		arr[end] = temp;
    		start++;
    		end--;
    	}
    }
}
