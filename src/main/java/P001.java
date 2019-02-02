/**
 * Two Sum
 * @Author 王少刚
 * @Date 2019/2/1 20:20
 */
public class P001 {
	public int[] twoSum(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j < nums.length; j ++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int[] ints = new P001().twoSum(nums, 9);
		for (int i : ints) {
			System.out.println(i);
		}
	}
}
