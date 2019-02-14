package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 3Sum
 *
 * @Author 王少刚
 * @Date 2019/2/4 14:28
 */
public class P015 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				Integer target = - nums[i] - nums[j];
				int[] newArray = Arrays.copyOfRange(nums, j + 1, nums.length);
				for (int n : newArray) {
					if (n == target) {
						LinkedList<Integer> integers = new LinkedList<Integer>();
						integers.add(nums[i]);
						integers.add(nums[j]);
						integers.add(target);
						Collections.sort(integers);
						if (!result.contains(integers)) {
							result.add(integers);
						}
						break;
					}
				}
			}

		}
		return result;
	}

	public static void main(String[] args) {
		new P015().threeSum(new int[] {-1,0,1,2,-1,-4});
	}
}
