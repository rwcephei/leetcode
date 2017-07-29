package array;

import java.util.HashMap;

public class TwoSum {
	// �ʼ���뷨�ǰ������������,��ʵ��ԱȽ��鷳,Ҫ����ԭ��������
	// ����ķ�������ֱ����HashMap�����ʣ����Ǹ���,���ﲻҪ���Ű���������һ��ʼ����HashMap
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = nums.length;
		for (int i = 0; i < n; ++i) {
			int remain = target - nums[i];
			if (map.containsKey(remain)) {
				res[0] = i;
				res[1] = map.get(remain);
				break;
			} else {
				map.put(nums[i], i);
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -1, -2, -3, -4, -5 };
		int target = -8;
		TwoSum t = new TwoSum();
		int[] res = t.twoSum(nums, target);
		for (int i = 0; i < res.length; ++i) {
			System.out.println(res[i]);
		}
	}

}
