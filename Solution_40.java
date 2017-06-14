
public class Solution_40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int xor = 0;
        int dif = 1;
    	for(int num : array){
    		xor ^= num;
    	}
    	for(int i = 0; i < 32; i++){
    		if(((xor >> i) & 1) == 1){
    			dif <<= i;
    			break;
    		}
    	}
    	for(int num : array){
    		if((num & dif) == dif)
    			num1[0] ^= num;
    		else
    			num2[0] ^= num;
    	}
    	return;
    }
}
