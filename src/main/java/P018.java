import java.util.*;

/**
 * @Author 王少刚
 * @Date 2019/2/4 19:30
 */
public class P018 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				for (int k = j + 1; k < nums.length - 1; k++) {
					int aim = target - nums[i] - nums[j] - nums[k];
					int[] newArray = Arrays.copyOfRange(nums, k + 1, nums.length);
					for (int n : newArray) {
						if (n == aim) {
							LinkedList<Integer> integers = new LinkedList<Integer>();
							integers.add(nums[i]);
							integers.add(nums[j]);
							integers.add(nums[k]);
							integers.add(aim);
							Collections.sort(integers);
							if (!result.contains(integers)) {
								result.add(integers);
							}
							break;
						}
					}
//					for (int l = k + 1; l < nums.length; l++) {
//						if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
//							ArrayList<Integer> integers = new ArrayList<Integer>();
//							integers.add(nums[i]);
//							integers.add(nums[j]);
//							integers.add(nums[k]);
//							integers.add(nums[l]);
//							Collections.sort(integers);
//							if (!result.contains(integers)) {
//								result.add(integers);
//							}
//						}
//					}
				}
			}
		}
		return result;
	}

}
