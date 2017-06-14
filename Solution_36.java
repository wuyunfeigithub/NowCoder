public class Solution_36 {
	public int InversePairs(int[] array) {
		if (array.length == 0 || array == null)
			return 0;

		int[] copy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			copy[i] = array[i];
		}

		int ret = helper(array, copy, 0, array.length - 1) % 1000000007;

		return ret;
	}

	private int helper(int[] data, int[] copy, int start, int end) {
		if (start == end) {
			copy[start] = data[start];
			return 0;
		}

		int len = (end - start + 1) / 2;
		int left = helper(copy, data, start, start + len - 1) % 1000000007;
		int right = helper(copy, data, start + len, end) % 1000000007;

		int leftPos = start + len - 1;
		int rightPos = end;
		int copyPos = end;
		int count = 0;

		while (leftPos >= start && rightPos >= start + len) {
			if (data[leftPos] > data[rightPos]) {
				copy[copyPos--] = data[leftPos--];
				count += rightPos - (start + len - 1);
				if (count >= 1000000007) {
					count %= 1000000007;
				}
			} else {
				copy[copyPos--] = data[rightPos--];
			}
		}

		while (leftPos >= start)
			copy[copyPos--] = data[leftPos--];
		while (rightPos >= start + len)
			copy[copyPos--] = data[rightPos--];

		return (left + right + count) % 1000000007;
	}
}
