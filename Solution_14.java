
public class Solution_14 {
    public void reOrderArray(int [] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            if((temp & 1) == 0) continue;
            int j = i - 1;
            for( ; j >= 0 && (array[j] & 1) == 0; j--){
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
    }
}
