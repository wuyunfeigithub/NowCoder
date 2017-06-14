import java.util.Arrays;

public class Solution_44 {
	public boolean isContinuous(int[] numbers) {
		if(numbers.length == 0 || numbers == null)
			return false;
		Arrays.sort(numbers);
		int count = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] == 0){
				count++;
				continue;
			}
			int delta = numbers[i + 1] - numbers[i];
			if (delta == 0)
				return false;
			count -= delta - 1;
		}
		return count >= 0;
	}
}
