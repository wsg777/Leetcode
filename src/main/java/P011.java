/**
 * Container With Most Water
 *
 * @Author 王少刚
 * @Date 2019/2/3 20:22
 */
public class P011 {
	public int maxArea(int[] height) {
		int maxCapacity = 0;
		for (int start = 0; start < height.length - 1; start++) {
			if (height[start] == 0) {
				continue;
			}
			for (int end = start + maxCapacity / height[start]; end < height.length; end++) {
				int capacity = (height[start] < height[end] ? height[start] : height[end]) * (end - start);
				if (capacity > maxCapacity) {
					maxCapacity = capacity;
				}
			}
		}
		return maxCapacity;
	}

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(new  P011().maxArea(height));
	}
}
