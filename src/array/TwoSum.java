package array;

import java.util.HashMap;

public class TwoSum {
	// 最开始的想法是把数组进行排序,其实相对比较麻烦,要保存原来的数组
	// 下面的方法就是直接在HashMap里查找剩余的那个数,这里不要想着把所有数都一开始加入HashMap
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
