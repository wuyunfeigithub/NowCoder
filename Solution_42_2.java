/*
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵�����
 * �������ַ���ģ�����ָ���������������һ���������ַ�����S��
 * �������ѭ������Kλ���������������磬�ַ�����S=��abcXYZdef��,
 * Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
 * �ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class Solution_42_2 {
    public String LeftRotateString(String str,int n) {
    	if(str.length() == 0)
    		return str;
        StringBuilder sb = new StringBuilder();
        n %= str.length();
        
        for (int i = n; i < str.length(); i++) {
			sb.append(str.charAt(i));
		}
        for (int i = 0; i < n; i++) {
			sb.append(str.charAt(i));
		}
        
        return sb.toString();
    }
}
