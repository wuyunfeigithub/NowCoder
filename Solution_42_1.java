/*
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
