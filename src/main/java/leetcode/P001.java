package leetcode;

/**
 * Two Sum
 *
 * @Author 王少刚
 * @Date 2019/2/1 20:20
 */
public class P001 {
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			int t = target - nums[i];
			for (int j = i + 1; j < length; j++) {
				if (nums[j] == t) {
					return new int[]{i, j};
				}
			}
		}

		return null;
	}
}
