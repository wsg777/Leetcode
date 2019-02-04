/**
 * 3Sum Closest
 *
 * @Author 王少刚
 * @Date 2019/2/4 15:50
 */
public class P016 {
	public int threeSumClosest(int[] nums, int target) {
		int closest = nums[0] + nums[1] + nums[2];
		int closestDistance = closest - target;
		closestDistance = closestDistance < 0 ? -closestDistance : closestDistance;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					int curDistance = nums[i] + nums[j] + nums[k] - target;
					curDistance = curDistance < 0 ? -curDistance : curDistance;
					if (curDistance < closestDistance) {
						closestDistance = curDistance;
						closest = nums[i] + nums[j] + nums[k];
					}
				}
			}
		}
		return closest;
	}
}
