import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution_28 {
    public ArrayList<String> Permutation(String str) {
    	Set<String> set = new HashSet<>();
    	ArrayList<String> rets = new ArrayList<>();
    	if(str.length() == 0) return rets; 
    	helper(rets, set, str.toCharArray(), 0);
    	Collections.sort(rets);
    	return rets;
    }
    
    private void helper(List<String> rets, Set<String> set, char[] str, int start){
    	if(start == str.length - 1){
    		String ret = String.valueOf(str);
    		if(!set.contains(ret)){
    			set.add(ret);
    			rets.add(ret);
    		}
    		return;
    	}
    	
    	for (int i = start; i < str.length; i++) {
    		//swap
			char temp = str[start];
			str[start] = str[i];
			str[i] = temp;
			
			helper(rets, set, str, start + 1);
			//swap, ¸´Î»
			temp = str[start];
			str[start] = str[i];
			str[i] = temp;
		}
    }
}
