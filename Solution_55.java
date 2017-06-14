/*
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 */
public class Solution_55 {
	int[] map = new int[128];
	StringBuilder sb = new StringBuilder();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        map[ch - ' ']++;
        sb.append(ch);
    }
  	//return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	for (int i = 0; i < sb.length(); i++) {
			char c = sb.charAt(i);
			if(map[c - ' '] == 1) {
				return c;
			}
		}
    	return '#';
    }
}
