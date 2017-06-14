/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0
 */
public class Solution_08 {
	public int minNumberInRotateArray(int[] array) {
		int start = 0, end = array.length - 1;
		while (start < end - 1) {
			int mid = (start + end) / 2;
			if (array[mid] >= array[start])
				start = mid;
			else if (array[mid] <= array[end])
				end = mid;
		}
		return array[end];
	}
}
