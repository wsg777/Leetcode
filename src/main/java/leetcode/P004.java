package leetcode;

/**
 * Median of Two Sorted Arrays
 *
 * @Author 王少刚
 * @Date 2019/2/2 17:18
 */
public class P004 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		// nums1 nums2 最小最大元素索引
		int min1 = 0;
		int min2 = 0;
		int max1 = nums1.length - 1;
		int max2 = nums2.length - 1;
		// 去掉一个最大一个最小，直到其中一个数组为空，或者两个数组都只剩一个元素
		while (max1 >= min1 && max2 >= min2) {
			// 如果两个数组都只剩一个元素，则计算中位数并返回
			if (max1 == min1 && max2 == min2) {
				return (nums1[min1] + nums2[min2]) * 0.5;
			}
			if (nums1[min1] < nums2[min2]) {
				min1++;
			} else {
				min2++;
			}
			if (nums1[max1] > nums2[max2]) {
				max1--;
			} else {
				max2--;
			}
		}
		if (max1 >= min1) {
			if ((max1 - min1) % 2 == 0) {
				return nums1[(min1 + max1) / 2];
			} else {
				int distance = (max1 - min1) / 2;
				return (nums1[min1 + distance] + nums1[max1 - distance]) / 2.0;
			}
		}
		if (max2 >= min2) {
			if ((max2 - min2) % 2 == 0) {
				return nums2[(min2 + max2) / 2];
			} else {
				int distance = (max2 - min2) / 2;
				return (nums2[min2 + distance] + nums2[max2 - distance]) / 2.0;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		System.out.println(new P004().findMedianSortedArrays(nums1, nums2));
	}
}
