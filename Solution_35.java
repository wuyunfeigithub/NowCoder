/*
 * 在一个字符串(1<=字符串长度<=10000，全部由大写字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class Solution_35 {
    public int FirstNotRepeatingChar(String str) {
    	if(str.equals("")) return -1;
    	int[][] map = new int[58][2];
    	
    	for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int pos = c - 'A';
			if(map[pos][0] == 0){
				map[pos][1] = i;
			}
			map[pos][0]++;
		}
    	
    	int ret = Integer.MAX_VALUE;
    	for (int i = 0; i < 58; i++) {
			if(map[i][0] == 1){
				ret = Math.min(ret, map[i][1]);
			}
		}
    	
        return ret;
    }
}
